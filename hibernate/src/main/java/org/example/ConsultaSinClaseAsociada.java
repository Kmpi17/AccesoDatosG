package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Iterator;

public class ConsultaSinClaseAsociada {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        String hql="from Empleado e,Departamento d where e.deptNo.id = d.id  order by e.apellido";
        Query query = s.createQuery(hql);
        Iterator it = query.list().iterator();
        while (it.hasNext()) {
            Object[] o = (Object[]) it.next();
            Empleado e=(Empleado)o[0];
            Departamento d=(Departamento)o[1];
            System.out.println(e);
            System.out.println(d);
        }

        String hql2="select e.deptNo.id,avg(salario),count(id) from Empleado e group by e.deptNo.id";
        Query query2 = s.createQuery(hql2);
        Iterator it2 = query2.list().iterator();
        while (it2.hasNext()) {
            Object[] o = (Object[]) it2.next();
            Byte departamento=(Byte)o[0];
            Double salario=(Double)o[1];
            Long cuenta=(Long)o[2];
            System.out.println(departamento+","+salario+","+cuenta);
        }



        s.close();
        sf.close();
    }
}

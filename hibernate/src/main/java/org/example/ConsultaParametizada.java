package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class ConsultaParametizada {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        String hql="from Empleado e where e.id=:numEmpleado";
        Query query = session.createQuery(hql);

        System.out.println("Dame el numero de empleados que quiere consultar");
        query.setParameter("numEmpleado",(short)7365);
        Empleado empleado = (Empleado)query.uniqueResult();
        System.out.println(empleado);

        System.out.println("Segunda sentencia parmetizada");
        String hql2="from Empleado emp where emp.deptNo=:deptNo and emp.oficio=:oficio";
        Query query2 = session.createQuery(hql2);
        query2.setParameter("deptNo",(byte) 30);
        query2.setParameter("oficio","VENDEDOR");
        List<Empleado> empleados = query2.list();
        Iterator<Empleado> iterator = empleados.iterator();
        while(iterator.hasNext()){
            Empleado emp2 =(Empleado) iterator.next();
            System.out.println(emp2);
        }




        session.close();
        sf.close();



    }
}

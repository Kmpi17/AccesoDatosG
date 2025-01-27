package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Iterator;

public class Consulta5 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        String hql="select new Totales[0] deptNo.count(e.empNo),avg(e.salario),d.nombre)From Empleado as e right join e.departamentos as d group by d.deptNo,d.dnombre";
        Query q = s.createQuery(hql);
        Iterator it = q.list().iterator();
        while(it.hasNext()){
            Totales totales = (Totales)it.next();
            System.out.println(totales.getNumero()+" "+totales.getMedia()+" "+totales.getCuenta());
        }

    }
}

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

import java.util.List;

public class ConsultasHQL {
    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion =sf.openSession();

        String hql = "from Departamento";

        Query query = sesion.createQuery(hql);
        List<Departamento> departamento=query.list();
        for(Departamento departamento1:departamento){
            System.out.println(departamento1.toString());
        }

        String hql2="from Empleado as e where e.deptNo.id=40";
        Query query2 = sesion.createQuery(hql2);
    List<Empleado> empleado=query2.list();
        for(Empleado empleado1:empleado){
            System.out.println(empleado1.toString());
        }

        sesion.close();
    }
}

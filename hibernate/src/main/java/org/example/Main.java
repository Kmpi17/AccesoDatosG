package org.example;

import org.hibernate.Hibernate;
import org.hibernate.*;

public class Main {
    public static void main(String[] args) {


        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("Inserto una fila en la tabla Departamento");

        Departamento departamento = new Departamento();
        departamento.setId((byte)69);
        departamento.setDmombre("Marketing");
        departamento.setLoc("Guadalajara");

        session.persist(departamento);
        tx.commit();
        session.close();
        sesion.close();
    }
}
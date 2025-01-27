package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class InsertaEmpleado {
    public static void main(String[] args) {
        SessionFactory factory =HibernateUtil.getSessionFactory();
        Session sesion =factory.openSession();
        Transaction tx = sesion.beginTransaction();

        System.out.println("Inserto un empleado");


        Short id=(short)1;
        String apellido="Verga";
        float comision=(float)2000;
        Short dir=(short)74499;
        LocalDate fechaAlta=LocalDate.now();
        String oficio="Butronero";
        float salario=2500;

        Departamento departamento=new Departamento();
        departamento.setId((byte)10);

        Empleado empleado = new Empleado(id,apellido,oficio,dir,fechaAlta,comision,salario,departamento);

        sesion.persist(empleado);
        tx.commit();
        factory.close();
        sesion.close();


    }
}

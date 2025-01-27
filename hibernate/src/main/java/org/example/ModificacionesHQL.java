package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ModificacionesHQL {
    public static void main(String[] args) {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            Transaction tx=session.beginTransaction();

            String hqlMod="update Empleado set salario=:nuevosalario where apellido=:apellidoPer";
            Query query=session.createQuery(hqlMod);
            query.setParameter("nuevosalario", (float)4400.00);
            query.setParameter("apellidoPer", "Sanchez");



            Departamento dep=new Departamento();
            dep.setId((byte)20);
            Empleado emp=new Empleado();
            emp.setId((short)69);
            emp.setApellido("Verega");
            emp.setSalario((float)4400.00);
            emp.setDeptNo(dep);

            System.out.println(emp);
            session.persist(emp);


            String hqlDel="delete  Empleado e where e.id=:idEmpleado";
            Query queryDel=session.createQuery(hqlDel);
            queryDel.setParameter("idEmpleado", 69);
            int filaDel=queryDel.executeUpdate();
            System.out.println(filaDel);

            int filaMod=query.executeUpdate();
           System.out.println(filaMod);

             String hqlInsert="insert into Departamento(id,dmombre,loc) select n.id, n.dnombre,n.loc from Nuevo n";
             Query queryInsert=session.createQuery(hqlInsert);
             int filasCreado=queryInsert.executeUpdate();
             System.out.println(filasCreado);


        tx.commit();
    }
}

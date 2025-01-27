/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author FP
 */
public class ListaDepartamentos {

    public static void main(String[] args) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Query q = session.createQuery("from Departamentos");
        List<Departamentos> lista = q.list();

        /*
        Iterator<Departamentos> iter = lista.iterator();
        System.out.println("Numero de departamentos " + lista.size());
        while (iter.hasNext()) {
            Departamentos depar = (Departamentos) iter.next();
            System.out.println(depar.getDeptNo() + " , " + depar.getDmombre());
        }
        */
        q.setFetchSize(10);
        Iterator iter=q.iterate();        
        while(iter.hasNext()){
            Departamentos depar=(Departamentos) iter.next();
            System.out.println(depar.getDeptNo()+" , "+depar.getDmombre());
            
        }
       
        Query q1=session.createQuery("from Empleados e where e.departamentos.deptNo = 20");
        List <Empleados> lista1=q1.list();
        Iterator <Empleados> iter1=lista1.iterator();
        while(iter1.hasNext()){
            Empleados emp=(Empleados) iter1.next();
            System.out.println(emp.getApellido()+" , "+emp.getSalario());
        }
        /*
        
        Query q2=session.createQuery("from Empleados  where empNo = :numemple");
        q2.setParameter("numemple", (short)7369);
        Empleados emple=(Empleados)q2.uniqueResult();
        System.out.println(emple.getApellido()+" , "+emple.getOficio());
        */
        
        Query q3=session.createQuery("from Empleados emp where emp.departamentos.deptNo = :ndep and emp.oficio = :ofi");
        q3.setParameter("ndep", (byte)30);
        q3.setParameter("ofi", "VENDEDOR");
        
        List <Empleados> lista3=q3.list();
        Iterator <Empleados> iter3=lista3.iterator();
        
        while(iter3.hasNext()){
            Empleados emp=(Empleados)iter3.next();
            System.out.println(emp.getApellido()+" , "+emp.getSalario());
        }
        
       SimpleDateFormat formatoTexto=new SimpleDateFormat("yyyy-MM.dd");
       String strFecha="1991-02-02";
       Date fecha=null;
       try{
           fecha=formatoTexto.parse(strFecha);
       }catch(ParseException ex){
           System.out.println(ex.getMessage());
       }
      
       /*
       Query q4=session.createQuery("from Empleados where fechaAlt= :fechaAlt1");
       q4.setDate("fechaAl1t", fecha);
       
        
       List<Byte>numeros=new ArrayList<Byte>();
       numeros.add((byte)10);
       numeros.add((byte)20);
       
       Query q5=session.createQuery("from Empleados emp where emp.departamentos.deptNo in (:listadep) order by emp.departamentos.deptNo");
       q5.setParameter("listadep", numeros);
       */
       
       //consultas sobre clases no asociadas

       Query q6=session.createQuery("from Empleados e, Departamentos d where e.departamentos.deptNo=d.deptNo order by Apellido");
       Iterator iter4=q6.iterate();
       while(iter4.hasNext()){
           Object [] par=(Object[])iter4.next();
           Empleados em=(Empleados) par[0];
           Departamentos de=(Departamentos)par[1];
           System.out.println(em.getApellido()+" , "+em.getSalario()+" , "+de.getDmombre()+" , "+de.getLoc());
       }
       /*
       Query q7=session.createQuery("select avg(em.salario) from Empleados as em");
       Double suma=(Double) q.uniqueResult();
        System.out.println("Salario minimo "+suma);
             
        Query q8=session.createQuery("select e.departamentos.deptNo.avg(salario),count(empNo) from Empleados e group by=departamentos.deptNo");
        Iterator iter5=q8.iterate();
        while(iter5.hasNext()){
            Object []par=(Object[]) iter5.next();
            Byte depar=(Byte) par[0];
            Double media =(Double) par[1];
            Long cuenta=(Long)par[2];
            System.out.println("Dept "+depar+" Media "+media+" Nemp "+cuenta);
        }
        */
        Query q9=session.createQuery("select  empresa.Totales.id.deptNo.count(e.empNo),avg(e.salario),d.dnombre)from Empleados as e right join e.departamentos as d group by d.deptNo, d.dnombre");
        Iterator iter6=q9.iterate();
        while(iter6.hasNext()){
            Totales tot=(Totales) iter6.next();
            System.out.println("");
        }
   
       Query q10=session.createQuery("select d.deptNo , count(e.empNo),avg(e.salario),d.dnombre from Empleados as e right join e.departamentos as d group by d.deptNo,d.dnombre");
       
       List <Object[]>filas=q10.list();
        for (int i = 0; i < filas.size(); i++) {
            Object[] filaActual=filas.get(i);
            System.out.println("Dep: "+filaActual[0]+" nombre "+filaActual[1]+" "+filaActual[2]+"  "+filaActual[3]);
        }
       
        session.close();
        sesion.close();
    }
}

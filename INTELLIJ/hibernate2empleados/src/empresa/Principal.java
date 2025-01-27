/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.*;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParseException {
        SessionFactory sesionFactory=NewHibernateUtil.getSessionFactory();
        Session sesion=sesionFactory.openSession();
        Transaction tx=sesion.beginTransaction();
        System.out.println("Inserto una fila en la tabla departamentos");
        
        //Departamentos dep = new Departamentos((byte)62,"MARKETING","GUADALAJARA");
        
        //sesion.save(dep);
        //Insertar un empleado... necesito un objeto de tipo departamento
        Departamentos dep = new Departamentos((byte)62);
        System.out.println("Inserto un EMPLEADO en el DEPARTAMENTOS");
        String formatofecha="1992/08/23";
        SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy/MM/dd");
        Date fecha=formatoFecha.parse(formatofecha);
        
        
        Empleados e=new Empleados((short)4455,dep,"GALLARDO","VENDEDOR",(short) 7499,fecha,(float)1500,(float) 100);
        
        sesion.save(e); 
        tx.commit();
        System.out.println("Se ha introducido ");
        sesion.close();
        sesionFactory.close();
    }
    
}

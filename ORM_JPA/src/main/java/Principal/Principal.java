/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibiliotecajpa");
        EntityManager em = emf.createEntityManager();
        
        Libros l1 = em.find(Libros.class, "123-456");
        List<Libros>libros2=em.createQuery("SELECT 1 FROM Libros 1").getResultList();
        
        for(Libros libros:libros2){
            System.out.println(libros.toString());
        }
          
        
        em.close();
        emf.close();
    }
}

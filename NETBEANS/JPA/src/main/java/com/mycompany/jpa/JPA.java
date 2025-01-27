/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

/**
 *
 * @author FP
 */
public class JPA {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("bibiliotecajpa");
        EntityManager em=emf.createEntityManager();
            
        Libros libros=em.find(Libros.class, "123-456");
        System.out.println(libros.toString());
        
        
        emf.close();
        em.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        File archivo= new File("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1FicherosR\\WINDOWS\\fortnite.xml");
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.getName());
        System.out.println(archivo.getParent());
        System.out.println(archivo.getPath());
        
        
        if(archivo.exists()){
            System.out.println("Existe");
        }else{
            System.out.println("No existe");
        }
           
       if(archivo.isDirectory()){
           System.out.println("Es directorio");
       }else{
           System.out.println("No es directorio");
       } 
       
    }
    
    
    
}

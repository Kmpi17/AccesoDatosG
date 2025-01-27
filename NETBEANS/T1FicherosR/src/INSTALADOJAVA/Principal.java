/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INSTALADOJAVA;

import java.io.File;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        
        File archivo = new File("C:\\Program Files\\Java\\jdk-21\\bin\\java.exe");
        
        
        if(archivo.exists()){
            System.out.println("Java está instalado");
        }else{
            System.out.println("No está instalado");
        }
        
       String version=archivo.getName();
        System.out.println("La version es"+version.substring(4, 6));
       
        
        
    }
    
}

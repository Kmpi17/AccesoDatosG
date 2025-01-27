/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File f = new File("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1FicherosR\\fichero");
        FileReader lectura=new FileReader(f);
        
        BufferedReader buffer=new BufferedReader(lectura);
        
        double linea=0.0;
        int palabras=1;
        int caracteres=0;
        int caracteressin=0;
        int parrafos=0;
        String contenido;
        String parrafosin;
       
        
        while((contenido=buffer.readLine())!=null){
            parrafos+=1;
            caracteres+=contenido.length();
            
            parrafosin=contenido;
            parrafosin=parrafosin.replace(" ","");
            caracteressin+=parrafosin.length();
           
           
            
            
            }
      
        
          linea=(double)caracteres/95;
          int lineaF=(int) Math.ceil(linea);
          
            
            
     
        
        
        lectura.close();
        buffer.close();
        System.out.println("Hay "+parrafos+" parrafos");
        System.out.println("Hay "+caracteres+" caracteres en total");
        System.out.println("Hay "+caracteressin+" caracteres sin espacio");
        System.out.println(palabras);
        System.out.println("Hay "+lineaF+" lineas");
    }
 
}

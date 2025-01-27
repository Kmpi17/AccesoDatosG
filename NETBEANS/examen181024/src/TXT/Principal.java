/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TXT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {
     private static void procesarLineaConfiguracion(String linea) {
        String[] partes = linea.split("=");
        if (partes.length == 2) {
            String parte1 = partes[0].trim();
            String parte2 = partes[1].trim();
            switch (parte1) {
               
                default ->
                    System.out.println("dato : " + parte2);
            }
        } 
    }
     
     public static void main(String[] args) {
        String archivoConfiguracion = "C:\\Users\\FP\\Documents\\NetBeansProjects\\PSP\\examen181024\\paths-debian.conf";
        try ( BufferedReader lector
                = new BufferedReader(
                        new FileReader(archivoConfiguracion))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                procesarLineaConfiguracion(linea);
            }
        } catch (IOException e) {
            System.err.println("Error..." + e.getMessage());
        }
    }
}
     


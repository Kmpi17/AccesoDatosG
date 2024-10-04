
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FP
 */
public class FicheroNombre {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner teclado= new Scanner(System.in);
        
        
        
        FileReader lectura= new FileReader("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1FicherosR\\plantilla");
        BufferedReader buffer=new BufferedReader(lectura);
        
        String contenido;
        
        
        System.out.println("Escribe el nombre");
        String nombre=teclado.next();
        System.out.println("Escribe el apellido");
        String apellido=teclado.next();
        
        String reemplazo;
        
        
        FileWriter escritura = new FileWriter("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1FicherosR\\carta.txt",true);
        while((contenido=buffer.readLine())!=null){
             
            reemplazo=contenido.replace("$nombre", nombre).replace("$apellidos", apellido);;
            
            
            
            
            escritura.write(reemplazo+"\n");
        }  
        
            escritura.close();
            lectura.close();
            buffer.close();
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.sql.*;

/**
 *
 * @author FP
 */
public class InsercionLibro {

    /**
     * @param args the command line arguments
     */
    private static String url = "jdbc:mysql://localhost:3306/biblioteca";
    public static void main(String[] args) {
      
        try (Connection con = DriverManager.getConnection(url, "root", "Mijefa1704"); Statement sentencia = con.createStatement();) {

            System.out.println("Conexion corrects");
            //recogida de datos
            String isbn = "123";
            String titulo = "";
            Integer numeroEmpleados = 0;
            String nombreAutor = "";
            String nombreEditorial = "";
            String nombreLibor = "";

            //comprobacion de datos
            String select = "SELECT * FROM libro WHERE isbn='" + isbn + "';";
            ResultSet rs = sentencia.executeQuery(select);
            if (rs.next()) {
                System.out.println("El libro ya existe");
               
            } else {
                System.out.println("El libro no existe");
                 VisualizarLibros();
            }

        } catch (SQLException ex) {
            System.out.println("Incoorecta");
            System.out.println(ex.getMessage());
        }
    }

    public static void VisualizarLibros() {
        try (Connection con = DriverManager.getConnection(url, "root", "Mijefa1704"); Statement sentencia = con.createStatement();) {

             String select = "select * from libro natural join (autor,editorial,tema);";
             ResultSet rs=sentencia.executeQuery(select);
             
             while(rs.next()){
                 System.out.println(""+rs.getString("ISBN"));
                 System.out.println(""+rs.getString("titulo"));
                 System.out.println(""+rs.getString("numeroejemplares"));
                 System.out.println(""+rs.getString("nombreeditorial"));
                 System.out.println(""+rs.getString("direccion"));
                 System.out.println(""+rs.getString("telefono"));
                 System.out.println(""+rs.getString("nombretema"));
                 System.out.println("");
                 System.out.println("-----------------------------------");
             }
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

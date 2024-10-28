/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;

import java.sql.*;

public class InsercionLibro {

    private static final String CADENA_CONEXION = "jdbc:mysql://localhost:3306/biblioteca";
 
    
    public static void visualizarLibros() {
        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "Mijefa1704"); Statement sentencia = con.createStatement();) {

            String selectLibro = "select * from libro natural join (autor,editorial,tema);";
            ResultSet sentenciaSelect = sentencia.executeQuery(selectLibro);
            while (sentenciaSelect.next()) {
                System.out.print(sentenciaSelect.getString("ISBN") + " ");
                System.out.print(sentenciaSelect.getString("titulo") + " ");
                System.out.println(sentenciaSelect.getInt("numeroejemplares") + " ");
                System.out.print(sentenciaSelect.getString("nombreAutor") + " ");
                System.out.println(sentenciaSelect.getString("nombreEditorial") + " ");
                System.out.print(sentenciaSelect.getString("direccion") + " ");
                System.out.print(sentenciaSelect.getString("telefono") + " ");
                System.out.print(sentenciaSelect.getString("nombretema") + " ");
                System.out.println("");
                System.out.println("--------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Conexión incorrecta");
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        //INSERCIÓN DE UN REGISTRO: libro
        try (Connection con = DriverManager.getConnection(CADENA_CONEXION, "root", "Mijefa1704"); Statement sentencia = con.createStatement(); 
                CallableStatement  procedimiento=con.prepareCall("CALL altaEditorial(?,?,?)")) {
            //System.out.println("Conexión correcta");
            //recogida de datos: LIBRO
            String isbn = "123";
            String titulo = "El monstruo sin nombre";
            Integer numeroEjemplares = 1;
            String nombreAutor = "Eduardo Cruz Ruiz";
            String nombreEditorial = "no";
            String nombreTema = "Infantil";

            //comprobación de datos: LIBRO
            String selectLibro = "SELECT * FROM libro WHERE isbn = '" + isbn + "'; ";
            ResultSet sentenciaSelect = sentencia.executeQuery(selectLibro);
            if (sentenciaSelect.next()) {
                System.out.println("El libro ya existe");
                visualizarLibros();
            } else {
            
                if (!existeAutor(nombreAutor, con)) {
                    altaAutor(nombreAutor, con);
                }
                int idAutor = buscarAutor(nombreAutor, con);

                int idTema = buscarTema(nombreTema, con);
                if (buscarTema(nombreTema,con) == -1) {
                    altaTema(nombreTema,con);
                }

                if (!existeEditorial(nombreEditorial,con)) {
                    //pedir datos editorial
                    String direccion="";
                    String telefono="";
                   procedimiento.setString(2, direccion);
                   procedimiento.setString(3, telefono);
                   procedimiento.execute();
                }
                int idEditorial = buscarEditorial(nombreEditorial,con);

                //Hay que dar de alta el libro
                altaLibro(con,isbn, titulo, numeroEjemplares, idAutor, idEditorial, idTema);
                visualizarLibros();
            }

            //inserción de datos: LIBRO
            //visualización de datos
        } catch (SQLException e) {
            System.out.println("1");
            System.out.println(e.getMessage());
        }

    }

    private static boolean existeAutor(String nombreAutor, Connection con) throws SQLException {
        System.out.println("EntraAutor");
        String sentenciaAutor = "SELECT * FROM autor WHERE NombreAutor='"+nombreAutor+"'";
        ResultSet sentenciaSelect = con.createStatement().executeQuery(sentenciaAutor);
        if (!sentenciaSelect.next()) {
            return false;
        } else {
            return true;
        }
    }

    private static void altaAutor(String nombreAutor, Connection con) throws SQLException {
        System.out.println("altaAutor");
        String sentenciaInsert = "insert into autor(nombreAutor) values (" + nombreAutor + ")";
        con.createStatement().executeUpdate(sentenciaInsert);
    }

    private static int buscarAutor(String nombreAutor, Connection con) throws SQLException {
        String sentenciaAutor = "Select * from autor where nombreAutor='" + nombreAutor + "'";
        ResultSet sentenciaSelect = con.createStatement().executeQuery(sentenciaAutor);
        sentenciaSelect.next();
        return sentenciaSelect.getInt("idAutor");
    }

    private static int buscarTema(String nombreTema, Connection con) {
        int devolver = -1;
        try (PreparedStatement selectTema = con.prepareStatement("SELECT idTema FROM tema WHERE nombreTema=?")) {

            selectTema.setString(1, nombreTema);
            ResultSet salida = selectTema.executeQuery();

            if (salida.next()) {
                devolver = salida.getInt("idTema");
            }
        } catch (SQLException ex) {

            System.out.println("Error en la sentencia preparada de buscar tema");
        }
        return devolver;
    }

    private static void altaTema(String nombreTema, Connection con) {
       try(PreparedStatement sentenciaInsert=con.prepareStatement("INSERT INTO ")){
           sentenciaInsert.setString(1, nombreTema);
           sentenciaInsert.execute();
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
       }
    }

    private static boolean existeEditorial(String nombreEditorial, Connection con) {
     boolean verdad=false;
        try(PreparedStatement sentenciaEditorial=con.prepareStatement("Select * from editorial WHERE nombreEditorial=?")){
         sentenciaEditorial.setString(1, nombreEditorial);
         ResultSet rs=sentenciaEditorial.executeQuery();
         if (!rs.next()) {
             verdad= false;
         }else{
             verdad= true;
         }
       
     }catch(SQLException ex){
            System.out.println("2");
         System.out.println(ex.getMessage());
     }
     return verdad; 
    }


    private static int buscarEditorial(String nombreEditorial, Connection con) {
      int devolver=-1;
      try(PreparedStatement selectEditorial=con.prepareStatement("SELECT idEditorial from editorial WHERE nombreEditorial=?")){
          selectEditorial.setString(1, nombreEditorial);
          ResultSet salida=selectEditorial.executeQuery();
          if (salida.next()) {
              devolver=salida.getInt("idEditorial");
          }
      }catch(SQLException ex){
          System.out.println("3");
          System.out.println(ex.getMessage());
      }
      return devolver;
    }

    private static void altaLibro(Connection con,String bn, String titulo, Integer numeroEjemplares, int idAutor, int idEditorial, int idTema) {
        
       try{
          PreparedStatement insertarLibro=con.prepareStatement("INSERT INTO libro (ISBN , Titulo, NumeroEjemplares,idAutor,idEditorial,idTema) VALUES(?,?,?,?,?,?)"); 
          insertarLibro.setString(1, bn);
          insertarLibro.setString(2, titulo);
          insertarLibro.setInt(3, numeroEjemplares);
          insertarLibro.setInt(4, idAutor);
          insertarLibro.setInt(5, idEditorial);
          insertarLibro.setInt(6, idTema);
          
          insertarLibro.execute();
          
       }catch(SQLException ex){
           System.out.println("4");
           System.out.println(ex.getMessage());
       }
        
    }

    private static void altaISBN() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

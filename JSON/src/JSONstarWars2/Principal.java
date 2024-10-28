/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        
        ArrayList <Persona> listaPersona=new ArrayList<>();
        Scanner teclado=new Scanner(System.in);                                                                                             
        try{
            String contenido=new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("C:\\Users\\FP\\Documents\\NetBeansProjects\\AccesoDatos\\JSON\\starwars.json")));
            JSONObject objetoPersona=new JSONObject(contenido);
            String nombre=objetoPersona.getString("name");
            String altura=objetoPersona.getString("height");
            Persona p1=new Persona(nombre,altura);
            JSONArray leerPelis=objetoPersona.getJSONArray("films");
            for (int i = 0; i <leerPelis.length(); i++) {
                JSONObject objetoPelicula=leerPelis.getJSONObject(i);
                String titulo=objetoPelicula.getString("title");
                int id_episodio=objetoPelicula.getInt("episode_id");
                String opening=objetoPelicula.getString("opening_crawl");
                String director=objetoPelicula.getString("director");
                Peliculas pe1=new Peliculas(titulo,id_episodio,opening,director);
                p1.add(pe1);
                
            }
            
            JSONArray leerEspecies=objetoPersona.getJSONArray("species");
            for (int i = 0; i < leerEspecies.length(); i++) {
                JSONObject objetoEspecies=leerEspecies.getJSONObject(i);
                String nombreEsp=objetoEspecies.getString("name");
                String clasificacion=objetoEspecies.getString("classification");
                String designacion=objetoEspecies.getString("designation");
                String media_altura=objetoEspecies.getString("average_height");
                Especies es1=new Especies(nombreEsp,clasificacion,designacion,media_altura);
               p1.add(es1);
            }
            listaPersona.add(p1);
            
            System.out.println("Lectura correcta");
            
            
        }catch(JSONException ex){
            System.out.println(ex.getMessage());
        }
        
        
        boolean salir=false;
        
        while(!salir){
            System.out.println("1 para ver registros");
            System.out.println("2 para insertar");
            System.out.println("3 para borrar");
            System.out.println("4 para actualizar");
            System.out.println("0 para salir y guardar");
            int eleccion=teclado.nextInt();
            
            if (eleccion==0) {
                
                JSONArray guardarPersonajes =new JSONArray();
                for (Persona p2:listaPersona) {
                    JSONObject guardarPersonaje=new JSONObject();
                    guardarPersonaje.put("nombre",p2.getNombre());
                    guardarPersonaje.put("altura", p2.getAltura());
                    JSONArray guardarPeliculas = new JSONArray();
                    for (Peliculas pe2:p2.getPeliculas()) {
                        JSONObject objetoPelicula=new JSONObject();
                        objetoPelicula.put("titulo", pe2.getTitulo());
                        objetoPelicula.put("id_episodio",pe2.getEpisodio_id());
                        objetoPelicula.put("opening", pe2.getOpening());
                        objetoPelicula.put("director", pe2.getOpening());
                    }
                }
                
            }
            
        }
    }
  
}

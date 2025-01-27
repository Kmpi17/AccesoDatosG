/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
          //leer
        try{
            String contenido=new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("starwars.json")));
            JSONObject jsonLeido=new JSONObject(contenido);
            String nombrePersonaje=jsonLeido.getString("name");
            String alturaPersonaje=jsonLeido.getString("heigth");
            JSONArray jsonPeliculasLeidas=jsonLeido.getJSONArray("films");
            JSONArray jsonEspeciesLeidas=jsonLeido.getJSONArray("species");
            Personaje personajeLeido=new Personaje(nombrePersonaje,alturaPersonaje);
            
            for (int i = 0; i < jsonPeliculasLeidas.length(); i++) {
                JSONObject jsonPeliculas=jsonPeliculasLeidas.getJSONObject(i);
                String titulo=jsonPeliculas.getString("title");
                String id_episodio=jsonPeliculas.getString("episode_id");
                String opening=jsonPeliculas.getString("opening_crawl");
                String director=jsonPeliculas.getString("director");
                
                Peliculas p1=new Peliculas(titulo,id_episodio,opening,director);
                personajeLeido.add(p1);
            }
                    
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    

    
  
        

}

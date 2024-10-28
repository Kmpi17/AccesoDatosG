/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {
     public static void main(String[] args) throws IOException {
      
         
         int contadorH=0;
         ArrayList <Heroes> listaHeroes = new ArrayList<>();
         try{
              String contenido=new String(java.nio.file.Files.readString(java.nio.file.Paths.get("C:\\Users\\FP\\Documents\\NetBeansProjects\\PSP\\examen181024\\examen_1.json")));
              JSONObject objetoHeroes =new JSONObject(contenido);
              String nombre=objetoHeroes.getString("hero");
             String equipo=objetoHeroes.getString("team");
             Heroes h=new Heroes(nombre,equipo);
              JSONArray arrayHeroes=objetoHeroes.getJSONArray("heroes");
                for (int i = 0; i <arrayHeroes.length(); i++) {
                    contadorH=arrayHeroes.length();
                 JSONObject objetoHeroesDatos=arrayHeroes.getJSONObject(i);
                 String heroe=objetoHeroesDatos.getString("hero");
                 String nombreH=objetoHeroesDatos.getString("name");
                 String link=objetoHeroesDatos.getString("link");
                 String img=objetoHeroesDatos.getString("img");
                 int tamaño=objetoHeroesDatos.getInt("size");
                 HeroesDatos hd=new HeroesDatos(heroe,nombreH,link,img,tamaño);
                 h.add(hd);
             }
              JSONArray arrayEquipos=objetoHeroes.getJSONArray("grupos");
              for (int i = 0; i <arrayEquipos.length(); i++) {
                 JSONObject objetoEquipo=arrayEquipos.getJSONObject(i);
                 String hero=objetoEquipo.getString("hero");
                 String name=objetoEquipo.getString("name");
                 String link=objetoEquipo.getString("link");
                 String img=objetoEquipo.getString("img");
                 int tamaño=objetoEquipo.getInt("size");
                 Equipo e1=new Equipo(hero,name,link,img,tamaño);
                 h.add(e1);
             }
              listaHeroes.add(h);
              
              System.out.println("Hay heroes:"+contadorH);
              
              for(Heroes h2:listaHeroes){
                  
                  for (HeroesDatos hd:h2.getDatosHeroes()) {
                      System.out.println(hd.getHeroe());
                      System.out.println(hd.getNombre());
                  }
                
                  
              }
                for(Heroes h2:listaHeroes){
                  
                  for (Equipo e2:h2.getDatosEquipos()) {
                      System.out.println(e2.getHeroe());
                      System.out.println(e2.getName());
                  }
                
                  
              }
              
         }catch(JSONException ex){
             System.out.println(ex.getMessage());
         }
        
     }
}

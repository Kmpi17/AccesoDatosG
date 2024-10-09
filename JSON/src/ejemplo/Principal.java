/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;
import static java.nio.file.Files.lines;
import org.json.*;
/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
       
        //escritura
        UsuarioAvanzado usuario1=new UsuarioAvanzado("Jude Bellingham",21);
        UsuarioAvanzado usuario2=new UsuarioAvanzado("Kylian Mbappe",25);
        UsuarioAvanzado usuario3=new UsuarioAvanzado("Mohamed",25);
        Proyecto proyecto=new Proyecto("Copa de Europa 24/25");
        proyecto.add(usuario1);
        proyecto.add(usuario2);
        proyecto.add(usuario3);
        
        JSONObject jsonProyecto=new JSONObject();
        jsonProyecto.put("nombre", proyecto.getNombre());
        
        JSONArray jsonParticipantes=new JSONArray();
        for (UsuarioAvanzado participante:proyecto.getParticipantes()) {
            JSONObject jsonParticipante=new JSONObject();
            jsonParticipante.put("nombre", participante.getNombre());
            jsonParticipante.put("edad", participante.getEdad());
            jsonParticipantes.put(jsonParticipante);
        }
        jsonProyecto.put("participantes", jsonParticipantes);
        try{
            java.nio.file.Files.write(java.nio.file.Paths.get("proyecto.json"), jsonProyecto.toString().getBytes());
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
        
        //leer
        
        try{
            String contenido=new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("proyecto.json")));
            JSONObject jsonLeido=new JSONObject(contenido);
            String nombreProyecto=jsonLeido.getString("nombre");
            JSONArray jsonParticipantesLeidos=jsonLeido.getJSONArray("participantes");
            Proyecto proyectoLeido=new Proyecto(nombreProyecto);
            
            
             
            
            for (int i = 0; i <jsonParticipantesLeidos.length(); i++) {
                JSONObject jsonParticipante=jsonParticipantesLeidos.getJSONObject(i);
                String nombreParticipante=jsonParticipante.getString("nombre");
                int edadParticipante=jsonParticipante.getInt("edad");
                
                UsuarioAvanzado participanteLeido=new UsuarioAvanzado(nombreParticipante,edadParticipante);
                
                proyectoLeido.add(participanteLeido);
                
              
            }
              for (UsuarioAvanzado ua1:proyectoLeido.getParticipantes()) {
                    System.out.println(ua1.toString());
                }
        }catch(java.io.IOException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONCurso;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Modulo m1=new Modulo(1,"Acceso a datos",6,8.45);
        Modulo m2=new Modulo(2,"PSP",4,9);
        
        Curso c1=new Curso("DAM 24/25");
        
        c1.add(m1);
        c1.add(m2);
        
        JSONObject jsonCurso=new JSONObject();
        jsonCurso.put("curso", c1.getNombre());
        
        JSONArray jsonModulos=new JSONArray();
        for (Modulo modulos:c1.getModulos()) {
            
            JSONObject jsonParticipante=new JSONObject();
            jsonParticipante.put("id", modulos.getId());
            jsonParticipante.put("nombre",modulos.getNombre());
            jsonParticipante.put("horaS", modulos.getHoraS());
            jsonParticipante.put("nota", modulos.getNota());
            jsonModulos.put(jsonParticipante);
        }
        
        jsonCurso.put("curso",jsonModulos);
        
        try{
            java.nio.file.Files.write(java.nio.file.Paths.get("curso.json"), jsonModulo.toString().getBytes());
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
        
        //leer
        
        
    }
}

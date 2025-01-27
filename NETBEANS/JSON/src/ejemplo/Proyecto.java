/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Proyecto {
    private String nombre;
    private ArrayList<UsuarioAvanzado> participantes;
    
    public Proyecto(String nombre){
        this.nombre=nombre;
        this.participantes=new ArrayList<UsuarioAvanzado>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<UsuarioAvanzado> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<UsuarioAvanzado> participantes) {
        this.participantes = participantes;
    }

    public boolean add(UsuarioAvanzado e) {
        return participantes.add(e);
    }

    
    
}

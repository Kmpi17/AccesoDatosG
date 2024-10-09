/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONCurso;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Curso {
    private String nombre;
    private ArrayList<Modulo> modulos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.modulos=new ArrayList<Modulo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public boolean add(Modulo e) {
        return modulos.add(e);
    }
    
    
    
    
}

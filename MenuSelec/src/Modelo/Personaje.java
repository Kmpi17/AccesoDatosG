/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author FP
 */
public class Personaje {
    
    private int nivel;
    private String nombre;
    private String genero;
    private String claseInicial;
    

    public Personaje(int nivel, String nombre, String genero, String claseInicial) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.genero = genero;
        this.claseInicial = claseInicial;
        
    }

    
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClaseInicial() {
        return claseInicial;
    }

    public void setClaseInicial(String claseInicial) {
        this.claseInicial = claseInicial;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nivel=" + nivel + ", nombre=" + nombre + ", genero=" + genero + ", claseInicial=" + claseInicial + '}';
    }

   
    
    
}

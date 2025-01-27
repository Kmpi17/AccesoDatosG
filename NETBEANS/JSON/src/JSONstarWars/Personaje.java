/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Personaje {
    private String nombre;
    private String altura;
    private ArrayList<Especies> especies;
    private ArrayList<Peliculas> peliculas;

    public Personaje(String nombre, String altura) {
        this.nombre = nombre;
        this.altura = altura;
        this.especies=new ArrayList<Especies>();
        this.peliculas=new ArrayList<Peliculas>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public ArrayList<Especies> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Especies> especies) {
        this.especies = especies;
    }

    public ArrayList<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    public boolean add(Especies e) {
        return especies.add(e);
    }

    public boolean add(Peliculas e) {
        return peliculas.add(e);
    }
    
    
    
    
    
    
}

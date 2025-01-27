/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars;

/**
 *
 * @author FP
 */
public class Peliculas {
    
    private String titulo;
    private String id;
    private String opening;
    private String direccion;

    public Peliculas(String titulo, String id, String opening, String direccion) {
        this.titulo = titulo;
        this.id = id;
        this.opening = opening;
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", id=" + id + ", opening=" + opening + ", direccion=" + direccion + '}';
    }
    
    
}

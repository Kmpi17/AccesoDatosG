/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars2;

/**
 *
 * @author FP
 */
public class Peliculas {
    
    private String titulo;
    private int episodio_id;
    private String opening;
    private String director;

    public Peliculas(String titulo, int episodio_id, String opening, String director) {
        this.titulo = titulo;
        this.episodio_id = episodio_id;
        this.opening = opening;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEpisodio_id() {
        return episodio_id;
    }

    public void setEpisodio_id(int episodio_id) {
        this.episodio_id = episodio_id;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", episodio_id=" + episodio_id + ", opening=" + opening + ", director=" + director + '}';
    }
    
    
}

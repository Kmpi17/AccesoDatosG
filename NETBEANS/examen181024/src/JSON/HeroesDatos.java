/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

/**
 *
 * @author FP
 */
public class HeroesDatos {
    private String heroe;
    private String nombre;
    private String link;
    private String img;
    private int tamaño;

    public HeroesDatos(String heroe, String nombre, String link, String img, int tamaño) {
        this.heroe = heroe;
        this.nombre = nombre;
        this.link = link;
        this.img = img;
        this.tamaño = tamaño;
    }

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "HeroesDatos{" + "heroe=" + heroe + ", nombre=" + nombre + ", link=" + link + ", img=" + img + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}

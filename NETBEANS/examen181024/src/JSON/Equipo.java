/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

/**
 *
 * @author FP
 */
public class Equipo {
    private String heroe;
    private String name;
    private String link;
    private String img;
    private int tamaño;

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Equipo(String heroe, String name, String link, String img, int tamaño) {
        this.heroe = heroe;
        this.name = name;
        this.link = link;
        this.img = img;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Equipo{" + "heroe=" + heroe + ", name=" + name + ", link=" + link + ", img=" + img + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}

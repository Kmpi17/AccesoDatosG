/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars;

/**
 *
 * @author FP
 */
public class Especies {
    
    private String nombre;
    private String classificacion;
    private String designacion;
    private String alturaMedia;
    private String colorPiel;
    private String colorPelo;
    private String esperanzaVida;
    private String lenguaje;

    public Especies(String nombre, String classificacion, String designacion, String alturaMedia, String colorPiel, String colorPelo, String esperanzaVida, String lenguaje) {
        this.nombre = nombre;
        this.classificacion = classificacion;
        this.designacion = designacion;
        this.alturaMedia = alturaMedia;
        this.colorPiel = colorPiel;
        this.colorPelo = colorPelo;
        this.esperanzaVida = esperanzaVida;
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClassificacion() {
        return classificacion;
    }

    public void setClassificacion(String classificacion) {
        this.classificacion = classificacion;
    }

    public String getDesignacion() {
        return designacion;
    }

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    public String getAlturaMedia() {
        return alturaMedia;
    }

    public void setAlturaMedia(String alturaMedia) {
        this.alturaMedia = alturaMedia;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(String esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Especies{" + "nombre=" + nombre + ", classificacion=" + classificacion + ", designacion=" + designacion + ", alturaMedia=" + alturaMedia + ", colorPiel=" + colorPiel + ", colorPelo=" + colorPelo + ", esperanzaVida=" + esperanzaVida + ", lenguaje=" + lenguaje + '}';
    }
    
    
}

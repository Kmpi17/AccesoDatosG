/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONstarWars2;

/**
 *
 * @author FP
 */
public class Especies {
    private String nombreEspecie;
    private String clasificacion;
    private String designacion;
    private String edadMedia;

    public Especies(String nombreEspecie, String clasificacion, String designacion, String edadMedia) {
        this.nombreEspecie = nombreEspecie;
        this.clasificacion = clasificacion;
        this.designacion = designacion;
        this.edadMedia = edadMedia;
    }

    @Override
    public String toString() {
        return "Especies{" + "nombreEspecie=" + nombreEspecie + ", clasificacion=" + clasificacion + ", designacion=" + designacion + ", edadMedia=" + edadMedia + '}';
    }

    
    
    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDesignacion() {
        return designacion;
    }

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    public String getEdadMedia() {
        return edadMedia;
    }

    public void setEdadMedia(String edadMedia) {
        this.edadMedia = edadMedia;
    }
    
    
    
}

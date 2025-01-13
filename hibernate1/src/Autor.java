
// Generated 04-nov-2024 10:00:38 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Autor generated by hbm2java
 */
public class Autor  implements java.io.Serializable {


     private Integer idAutor;
     private String nombreAutor;
     private Set libros = new HashSet(0);

    public Autor() {
    }

	
    public Autor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    public Autor(String nombreAutor, Set libros) {
       this.nombreAutor = nombreAutor;
       this.libros = libros;
    }
   
    public Integer getIdAutor() {
        return this.idAutor;
    }
    
    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
    public String getNombreAutor() {
        return this.nombreAutor;
    }
    
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    public Set getLibros() {
        return this.libros;
    }
    
    public void setLibros(Set libros) {
        this.libros = libros;
    }




}



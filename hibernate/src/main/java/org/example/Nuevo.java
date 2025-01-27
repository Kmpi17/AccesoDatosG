package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nuevos")
public class Nuevo {
    @Id
    @Column(name = "dept_no", nullable = false)
    private Byte id;

    @Column(name = "dnombre", length = 15)
    private String dnombre;

    @Column(name = "loc", length = 15)
    private String loc;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
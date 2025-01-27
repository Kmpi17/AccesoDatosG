package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @Column(name = "dept_no", nullable = false)
    private Byte id;

    @Column(name = "dmombre", length = 15)
    private String dmombre;

    @Column(name = "loc", length = 15)
    private String loc;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getDmombre() {
        return dmombre;
    }

    public void setDmombre(String dmombre) {
        this.dmombre = dmombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", dmombre='" + dmombre + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
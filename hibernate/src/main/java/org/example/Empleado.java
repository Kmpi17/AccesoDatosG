package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "emp_no", nullable = false)
    private Short id;

    @Column(name = "apellido", length = 19)
    private String apellido;

    @Column(name = "oficio", length = 10)
    private String oficio;

    @Column(name = "dir")
    private Short dir;

    @Column(name = "fecha_alt")
    private LocalDate fechaAlt;

    @Column(name = "salario")
    private Float salario;

    @Column(name = "comision")
    private Float comision;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dept_no", nullable = false)
    private Departamento deptNo;

    public Empleado(Short id, String apellido, String oficio, Short dir, LocalDate fechaAlt, Float salario, Float comision, Departamento deptNo) {
        this.id = id;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.fechaAlt = fechaAlt;
        this.salario = salario;
        this.comision = comision;
        this.deptNo = deptNo;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", oficio='" + oficio + '\'' +
                ", dir=" + dir +
                ", fechaAlt=" + fechaAlt +
                ", salario=" + salario +
                ", comision=" + comision +
                ", deptNo=" + deptNo +
                '}';
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Short getDir() {
        return dir;
    }

    public void setDir(Short dir) {
        this.dir = dir;
    }

    public LocalDate getFechaAlt() {
        return fechaAlt;
    }

    public void setFechaAlt(LocalDate fechaAlt) {
        this.fechaAlt = fechaAlt;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public Departamento getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Departamento deptNo) {
        this.deptNo = deptNo;
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.example.cdm;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author FP
 */
public interface RepositorioAlumno extends JpaRepository<Alumno, Long> {
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.example.cdm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author FP
 */
@RestController
@RequestMapping("/alumnos")
public class Controlador {
    private final ServicioUsuario servicioUsuario;

    public Controlador(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }
        
    @GetMapping()
    public List<Alumno> listarAlumnos() {
        return servicioUsuario.obteneTodos();
    }
    
   /* @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        return null;
    }
     */  
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Alumno alumno) {
        return ResponseEntity.ok(this);
    }
 
    
}

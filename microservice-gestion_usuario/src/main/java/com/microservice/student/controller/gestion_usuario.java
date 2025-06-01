package com.microservice.gestion_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.gestion_usuario.service.IGestionUsuarioService;
import com.microservice.gestion_usuario.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/gestion_usuario")
public class GestionUsuarioController {

    @Autowired
    private IGestionUsuarioService gestionUsuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUsuario(@RequestBody Usuario usuario){
        gestionUsuarioService.save(usuario);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllUsuarios(){
        return ResponseEntity.ok(gestionUsuarioService.findAll());
    }

    @GetMapping("/search/{id}")    
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(gestionUsuarioService.findById(id));
    }

    @GetMapping("/search-by-course/{courseId}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long courseId){
         System.out.println("-------------------------------------------------------------------"+ courseId);
         return ResponseEntity.ok(gestionUsuarioService.findByIdCourse(courseId));
    }
}


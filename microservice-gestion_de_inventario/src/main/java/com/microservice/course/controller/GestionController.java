package com.microservice.course.controller;

import com.microservice.course.model.GestionDeInventario;
import com.microservice.course.service.IGestionDeInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/gestion-de-inventario")
public class GestionDeInventarioController {

    @Autowired
    private IGestionDeInventarioService gestionDeInventarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveGestionDeInventario(@RequestBody GestionDeInventario gestionDeInventario) {                
        gestionDeInventarioService.save(gestionDeInventario);
    }
    
    @GetMapping("/all")
    public ResponseEntity<?> findAllGestionDeInventario(){
        return ResponseEntity.ok(gestionDeInventarioService.findAll());
    }
    
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(gestionDeInventarioService.findById(id));
    }
    
    @GetMapping("/search-items/{idGestion}")
    public ResponseEntity<?> findItemsByGestionId(@PathVariable Long idGestion){
        return ResponseEntity.ok(gestionDeInventarioService.findItemsByGestionId(idGestion));
    }

}


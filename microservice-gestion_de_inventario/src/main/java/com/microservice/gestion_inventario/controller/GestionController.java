package com.microservice.gestion_inventario.controller;

import com.microservice.gestion_inventario.model.Inventario;
import com.microservice.gestion_inventario.service.IInventarioService;
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
@RequestMapping("/api/v1/inventario")
public class InventarioController {

    @Autowired
    private IInventarioService inventarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveInventario(@RequestBody Inventario inventario) {
        inventarioService.save(inventario);
    }
    
    @GetMapping("/all")
    public ResponseEntity<?> findAllInventario(){
        return ResponseEntity.ok(inventarioService.findAll());
    }
    
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(inventarioService.findById(id));
    }
    
    @GetMapping("/search-items/{idInventario}")
    public ResponseEntity<?> findItemsByInventarioId(@PathVariable Long idInventario){
        return ResponseEntity.ok(inventarioService.findItemsByInventarioId(idInventario));
    }

}



package com.microservice.gestion_usuario.controller;

import com.microservice.gestion_usuario.model.Usuario;
import com.microservice.gestion_usuario.service.IGestionUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/gestion-usuarios")
public class GestionUsuarioController {

    @Autowired
    private IGestionUsuarioService gestionUsuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUsuario(@RequestBody Usuario usuario) {
        gestionUsuarioService.save(usuario);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllUsuarios() {
        return ResponseEntity.ok(gestionUsuarioService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(gestionUsuarioService.findById(id));
    }

    @GetMapping("/search-by-unidad/{unidadId}")
    public ResponseEntity<?> findByUnidadId(@PathVariable Long unidadId) {
        return ResponseEntity.ok(gestionUsuarioService.findByUnidadId(unidadId));
    }
}


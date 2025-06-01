package com.microservice.gestion_usuario.service;

import com.microservice.gestion_usuario.model.Usuario;

import java.util.List;

public interface IGestionUsuarioService {

    List<Usuario> findAll();

    Usuario findById(Long id);

    void save(Usuario usuario);

    List<Usuario> findByUnidadId(Long unidadId);

}

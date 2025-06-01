package com.microservice.gestion_usuario.service;

import com.microservice.gestion_usuario.model.Usuario;
import com.microservice.gestion_usuario.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionUsuarioServiceImpl implements IGestionUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(); // Lanza excepción si no encuentra
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findByUnidadId(Long unidadId) {
        return usuarioRepository.findAllByUnidadId(unidadId); // Método ajustado en el repositorio
    }
}

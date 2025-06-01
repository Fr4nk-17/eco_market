package com.microservice.gestion_usuario.repository;

import com.microservice.gestion_usuario.model.Usuario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.unidadId = :unidadId")
    List<Usuario> findAllByUnidadId(Long unidadId);
    

    // También podrías usar Query Method (más limpio):
    // List<Usuario> findAllByCursoId(Long cursoId);
}

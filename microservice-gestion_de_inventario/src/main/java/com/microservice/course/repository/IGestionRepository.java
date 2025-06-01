package com.microservice.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.course.model.GestionDeInventario;

@Repository
public interface IGestionDeInventarioRepository extends JpaRepository<GestionDeInventario, Long> {
    
}

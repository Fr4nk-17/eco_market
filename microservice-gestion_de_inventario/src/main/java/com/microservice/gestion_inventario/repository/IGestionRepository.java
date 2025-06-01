package com.microservice.gestion_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.gestion_inventario.model.Inventario;

@Repository
public interface IInventarioRepository extends JpaRepository<Inventario, Long> {
    
    // Puedes agregar métodos personalizados si lo necesitas
    // List<Inventario> findByNombreProductoContaining(String nombre);
}

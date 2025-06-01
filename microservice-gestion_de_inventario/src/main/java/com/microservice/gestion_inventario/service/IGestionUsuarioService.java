package com.microservice.gestion_inventario.service;

import com.microservice.gestion_inventario.model.Inventario;
import com.microservice.gestion_inventario.dto.InventarioDTO;
import com.microservice.gestion_inventario.http.response.InventarioResponse;

import java.util.List;

public interface IInventarioService {

    List<Inventario> findAll();

    Inventario findById(Long id);

    void save(Inventario inventario);

    // Buscar por nombre del producto (opcional)
    List<InventarioDTO> findByNombreProducto(String nombreProducto);

    // Armar respuesta detallada de inventario
    InventarioResponse buildInventarioResponse(Long id);
}

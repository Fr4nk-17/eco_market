package com.microservice.gestion_inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.gestion_inventario.dto.InventarioDTO;
import com.microservice.gestion_inventario.http.response.InventarioResponse;
import com.microservice.gestion_inventario.model.Inventario;
import com.microservice.gestion_inventario.repository.IInventarioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventarioServiceImpl implements IInventarioService {

    @Autowired
    private IInventarioRepository inventarioRepository;

    @Override
    public List<Inventario> findAll() {
        return inventarioRepository.findAll();
    }

    @Override
    public Inventario findById(Long id) {
        return inventarioRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Inventario inventario) {
        inventarioRepository.save(inventario);
    }

    @Override
    public List<InventarioDTO> findByNombreProducto(String nombreProducto) {
        return inventarioRepository.findAll().stream()
                .filter(inv -> inv.getNombreProducto().equalsIgnoreCase(nombreProducto))
                .map(inv -> InventarioDTO.builder()
                        .nombreProducto(inv.getNombreProducto())
                        .descripcion(inv.getDescripcion())
                        .cantidad(inv.getCantidad())
                        .gestionId(inv.getId())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public InventarioResponse buildInventarioResponse(Long id) {
        Inventario inventario = inventarioRepository.findById(id).orElseThrow();

        InventarioDTO inventarioDTO = InventarioDTO.builder()
                .nombreProducto(inventario.getNombreProducto())
                .descripcion(inventario.getDescripcion())
                .cantidad(inventario.getCantidad())
                .gestionId(inventario.getId())
                .build();

        return InventarioResponse.builder()
                .nombreInventario("Inventario #" + inventario.getId())
                .responsable(inventario.getResponsable())
                .inventarioDTOList(List.of(inventarioDTO))
                .build();
    }
}


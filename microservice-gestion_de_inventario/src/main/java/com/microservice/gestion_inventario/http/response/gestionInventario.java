package com.microservice.gestion_inventario.http.response;

import com.microservice.gestion_inventario.dto.InventarioDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class InventarioResponse {
    private String nombreInventario; // Antes: nombreGestion
    private String responsable;
    private List<InventarioDTO> inventarioDTOList; // Antes: gestionDeInventarioDTOList
}

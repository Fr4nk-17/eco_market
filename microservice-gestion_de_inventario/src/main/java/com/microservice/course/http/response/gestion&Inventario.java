package com.microservice.course.http.response;

import com.microservice.course.dto.GestionDeInventarioDTO;

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
    private String nombreGestion;
    private String responsable;
    private List<GestionDeInventarioDTO> gestionDeInventarioDTOList;
}

package com.microservice.course.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GestionDeInventarioDTO {

    private String nombreProducto;
    private String descripcion;
    private int cantidad;
    private Long gestionId;  // Equivale a courseId en el original

}

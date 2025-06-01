package com.microservice.gestion_inventario.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventarioDTO {

    private Long inventarioId;      // Cambiado desde gestionId
    private String nombreProducto;
    private String descripcion;
    private int cantidad;
    
    // Puedes agregar más campos si los necesitas, por ejemplo:
    // private String ubicacion;
    // private LocalDate fechaIngreso;
    // private String estado;

}

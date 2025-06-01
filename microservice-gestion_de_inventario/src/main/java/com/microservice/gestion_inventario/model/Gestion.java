package com.microservice.gestion_inventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name="inventario")  // Cambiado de gestion_de_inventario
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProducto;
    private String descripcion;  // Puedes agregarlo si lo necesitas
    private int cantidad;        // Puedes agregarlo si lo necesitas
    private String responsable;

    // Puedes agregar más campos si lo deseas, por ejemplo:
    // private LocalDate fechaIngreso;
    // private String ubicacion;

}


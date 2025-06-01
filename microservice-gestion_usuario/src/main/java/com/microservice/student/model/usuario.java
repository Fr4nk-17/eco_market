package com.microservice.gestion_usuario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name="usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    private String email;

    @Column(name = "curso_id")
    private Long cursoId; // Si usas este campo para buscar en otro microservicio, puedes mantenerlo o cambiar nombre según convenga

}


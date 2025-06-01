package com.microservice.course.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.course.dto.GestionDeInventarioDTO;

import java.util.List;

@FeignClient(name = "msvc-gestion-de-inventario", url = "localhost:8090")
public interface GestionDeInventarioClient {

    @GetMapping("/api/v1/gestion-de-inventario/search-by-course/{courseId}")    
    List<GestionDeInventarioDTO> findAllByCourse(@PathVariable Long courseId);

}

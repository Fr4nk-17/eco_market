package com.microservice.gestion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.gestion.dto.GestionDeInventarioDTO;

import java.util.List;

@FeignClient(name = "msvc-gestion-de-inventario", url = "http://localhost:8090")
public interface GestionDeInventarioClient {

    @GetMapping("/api/v1/gestion-de-inventario/search-items/{idGestion}")
    List<GestionDeInventarioDTO> findItemsByGestionId(@PathVariable("idGestion") Long idGestion);

}

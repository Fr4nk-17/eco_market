package com.microservice.gestion_de_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class GestionDeInventarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeInventarioApplication.class, args);
    }

}

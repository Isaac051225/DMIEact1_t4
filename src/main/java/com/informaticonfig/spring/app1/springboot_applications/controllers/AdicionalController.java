package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class AdicionalController {

    // Endpoint c) Regresa un objeto JSON simple con el estado del servidor
    @GetMapping("/estado-sistema")
    public Map<String, Object> obtenerEstado() {
        return Map.of(
            "estado", "OK",
            "codigo", 200,
            "mensaje", "Servidor local corriendo correctamente"
        );
    }
}
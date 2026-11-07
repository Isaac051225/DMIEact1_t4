package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class DatosController {

    @GetMapping("/mis-materias")
    // Endpoint b) Regresa una lista simulada (materias)
    public List<String> obtenerMaterias() {
        return List.of("Programación Web", "Conmutacion de redes", "Lenguajes y Automatas II", "PLF");
    }
}

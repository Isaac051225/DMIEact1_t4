package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class InfoController {

    @GetMapping("/mi-info")
    public String detalles_info() {

        return "Actividad: Spring boot | Alumno: [Isaac Diaz]";
    }

}

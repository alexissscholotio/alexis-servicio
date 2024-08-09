package com.alexis.alexis_servicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AlexisController {

    @GetMapping("/mi-nombre")
    public String getNombre() {
        return "Alexiss";
    }



}




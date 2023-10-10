package com.tuempresa.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    public static void main(String[] args) {

    }
    @GetMapping("/saludo")
    public String saludar() {
        return "Hola, esta es mi API!";
    }
}

package com.example.Softviertienda.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoControlador {
    @GetMapping("/hola")
    public String Saludar(){
        return "Nunca pares de aprender";
    }
}

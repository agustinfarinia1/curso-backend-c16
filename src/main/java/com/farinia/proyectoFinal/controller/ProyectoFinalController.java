package com.farinia.proyectoFinal.controller;

import com.farinia.proyectoFinal.model.Productos;
import com.farinia.proyectoFinal.service.ProductoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProyectoFinalController {

    private final ProductoServiceInterface service;

    @PostMapping("/prod")
    public Productos createProd(@RequestBody Productos producto) {
        return service.create(producto);
    }

    @GetMapping("/prod/{id}")
    public Productos findProduct(@PathVariable String id) {
        return service.findByid(id);
    }
}

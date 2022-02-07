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

    @PutMapping("/prod/{id}")
    public Productos updateProduct(@PathVariable String id,@RequestBody Productos producto) {
        return service.update(id, producto);
    }

    @GetMapping("/prod")
    public List<Productos> searchProduct() {
        return service.searchAll();
    }

    @DeleteMapping("/prod/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.delete(id);
    }
}

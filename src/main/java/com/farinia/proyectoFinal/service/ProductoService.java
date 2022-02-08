package com.farinia.proyectoFinal.service;

import com.farinia.proyectoFinal.cache.CacheRestaurante;
import com.farinia.proyectoFinal.model.Productos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService implements ProductoServiceInterface {

    private final CacheRestaurante<Productos> cache;
    @Override
    public Productos create(Productos request) {
        return cache.save(request.getId(),request);
    }

    @Override
    public Productos findByid(String id) {
        return cache.recover(id, Productos.class);
    }
}

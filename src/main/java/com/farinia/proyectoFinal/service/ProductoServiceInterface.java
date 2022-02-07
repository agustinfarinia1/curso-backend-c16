package com.farinia.proyectoFinal.service;

import com.farinia.proyectoFinal.model.Productos;

import java.util.List;

public interface ProductoServiceInterface {
    Productos create(Productos request);
    Productos findByid(String id);
    Productos update(String id, Productos request);
    List<Productos> searchAll();
    void delete(String id);
}

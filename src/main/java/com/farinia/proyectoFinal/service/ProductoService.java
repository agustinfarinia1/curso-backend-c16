package com.farinia.proyectoFinal.service;

import com.farinia.proyectoFinal.model.Productos;
import com.farinia.proyectoFinal.repository.ProductoRepositoryMongo;
import com.farinia.proyectoFinal.service.ProductoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService implements ProductoServiceInterface {

    private final ProductoRepositoryMongo repository;
    @Override
    public Productos create(Productos request) {
        return repository.save(request);
    }

    @Override
    public Productos findByid(String id) {
        var resp = repository.findById(id);
        if(resp.isPresent()){
            return resp.get();
        }
        return null;
    }

    @Override
    public Productos update(String id, Productos request) {
        request.setId(id);
        return repository.save(request);
    }

    @Override
    public List<Productos> searchAll() {
        return repository.findAll();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}

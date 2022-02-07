package com.farinia.proyectoFinal.repository;

import com.farinia.proyectoFinal.model.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositoryMongo extends MongoRepository<Productos, String> {
}

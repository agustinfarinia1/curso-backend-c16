package com.farinia.proyectoFinal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@SuperBuilder(toBuilder = true)
public class Productos implements Serializable {
    private String id;
    private String nombre;
    private double precio;
    private String categoria;
    private String descripcion;
}

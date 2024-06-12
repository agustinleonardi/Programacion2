package org.example.dto;

import lombok.Getter;
import org.example.entity.Categoria;

@Getter
public class ProductoDto {
    private int Id;

    private String Nombre;

    private String Descripcion;

    private Categoria categoria;
}

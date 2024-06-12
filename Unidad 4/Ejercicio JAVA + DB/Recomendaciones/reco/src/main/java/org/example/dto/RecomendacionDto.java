package org.example.dto;

import lombok.Getter;
import org.example.entity.Producto;
@Getter
public class RecomendacionDto {
    private int id;
    private Producto producto;
    private String texto;
    private int valoracion;
}

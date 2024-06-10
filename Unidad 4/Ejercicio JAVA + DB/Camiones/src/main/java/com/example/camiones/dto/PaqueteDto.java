package com.example.camiones.dto;

import com.example.camiones.entities.Camion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaqueteDto {
    private int id;
    private double peso;
    private double altura;
    private double profundidad;
    private Camion camionAsignado;
}

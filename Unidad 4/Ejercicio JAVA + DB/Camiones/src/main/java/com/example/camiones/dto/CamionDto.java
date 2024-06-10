package com.example.camiones.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CamionDto {
    private int id;
    private String marca;
    private String modelo;
    private String nombreConductor;
}

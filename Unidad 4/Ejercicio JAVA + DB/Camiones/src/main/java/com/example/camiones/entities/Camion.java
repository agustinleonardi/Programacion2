package com.example.camiones.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Camiones")
@Setter
@Getter
public class Camion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="marca", nullable = false)
    private String marca;
    @Column(name = "modelo",nullable = false)
    private String modelo;
    @Column(name="nombreConductor",nullable = false)
    private String nombreConductor;
    @OneToMany(mappedBy = "camionAsignado")
    private List<Paquete> paquetes = new ArrayList<>();


}

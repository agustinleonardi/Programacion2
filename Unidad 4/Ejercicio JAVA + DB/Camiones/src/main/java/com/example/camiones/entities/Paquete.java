package com.example.camiones.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "paquetes")
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double peso;
    private double altura;
    private double profundidad;
    @ManyToOne
    @JoinColumn(name="camion_asignado", nullable = false, referencedColumnName = "id")
    private Camion camionAsignado;

}

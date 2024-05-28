package com.example.medios_de_transporte.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Entity
public class MedioTransporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private double CapacidadMaximaCarga;

    private double VelocidadMaxima;
}

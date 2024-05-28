package com.example.medios_de_transporte.clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Carga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "paquete_id",referencedColumnName = "id")
    private Paquete paqueteAsociado;
    @ManyToOne
    @JoinColumn(name = "medioTransporte_id",referencedColumnName = "id")
    private MedioTransporte medioTransporte;

    private LocalDateTime FechaHoraCarga;

}

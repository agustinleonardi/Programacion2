package com.example.medios_de_transporte.repository;

import com.example.medios_de_transporte.clases.MedioTransporte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedioTransporteRepository extends JpaRepository <MedioTransporte, Long> {
}

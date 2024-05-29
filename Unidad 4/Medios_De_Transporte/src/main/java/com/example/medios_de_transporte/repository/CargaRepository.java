package com.example.medios_de_transporte.repository;

import com.example.medios_de_transporte.clases.Carga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargaRepository extends JpaRepository<Carga, Long> {
    Carga saveCarga(Carga carga);
    List<Carga> getAllCarga();
}

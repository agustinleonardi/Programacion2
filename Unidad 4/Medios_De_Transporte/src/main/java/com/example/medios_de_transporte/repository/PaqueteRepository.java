package com.example.medios_de_transporte.repository;

import com.example.medios_de_transporte.clases.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaqueteRepository extends JpaRepository <Paquete, Long>{
    Paquete savePaquete(Paquete paquete);

    List<Paquete> getAllPaquetes();


}

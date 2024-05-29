package com.example.medios_de_transporte.interfaces;

import com.example.medios_de_transporte.clases.Paquete;

import java.util.List;

public interface PaqueteService {
    Paquete savePaquete(Paquete paquete);
    List<Paquete> getAllPaquetes();
}

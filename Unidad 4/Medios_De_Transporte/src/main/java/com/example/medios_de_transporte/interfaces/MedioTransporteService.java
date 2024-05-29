package com.example.medios_de_transporte.interfaces;

import com.example.medios_de_transporte.clases.MedioTransporte;

import java.util.List;

public interface MedioTransporteService {
    MedioTransporte saveMedioTransporte(MedioTransporte medioTransporte);
    List<MedioTransporte> getAllMediosTransporte();
}

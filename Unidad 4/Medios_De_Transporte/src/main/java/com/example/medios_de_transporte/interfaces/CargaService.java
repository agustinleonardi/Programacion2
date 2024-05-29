package com.example.medios_de_transporte.interfaces;

import com.example.medios_de_transporte.clases.Carga;

import java.util.List;

public interface CargaService {
    Carga saveCarga(Carga carga);
    List<Carga> getAllCargas();

}

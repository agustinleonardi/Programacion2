package com.example.medios_de_transporte.service;

import com.example.medios_de_transporte.clases.Carga;
import com.example.medios_de_transporte.interfaces.CargaService;
import com.example.medios_de_transporte.repository.CargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CargaServiceImp implements CargaService {
    @Autowired
    private CargaRepository cargaRepository;

    @Override
    public Carga saveCarga(Carga carga) {
        return cargaRepository.save(carga);
    }

    @Override
    public List<Carga> getAllCargas() {
        return cargaRepository.findAll();
    }
}

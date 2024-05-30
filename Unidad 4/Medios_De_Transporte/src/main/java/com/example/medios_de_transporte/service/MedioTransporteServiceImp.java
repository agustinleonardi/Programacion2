package com.example.medios_de_transporte.service;

import com.example.medios_de_transporte.clases.MedioTransporte;
import com.example.medios_de_transporte.interfaces.MedioTransporteService;
import com.example.medios_de_transporte.repository.MedioTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedioTransporteServiceImp implements MedioTransporteService {
    @Autowired
    private MedioTransporteRepository medioTransporteRepository;

    @Override
    public MedioTransporte saveMedioTransporte(MedioTransporte medioTransporte) {
        return medioTransporteRepository.save(medioTransporte);
    }

    @Override
    public List<MedioTransporte> getAllMediosTransporte() {
        return medioTransporteRepository.findAll();
    }
}

package com.example.medios_de_transporte.service;

import com.example.medios_de_transporte.clases.Paquete;
import com.example.medios_de_transporte.interfaces.PaqueteService;
import com.example.medios_de_transporte.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaqueteServiceImp implements PaqueteService {
    @Autowired
    private PaqueteRepository paqueteRepository;

    @Override
    public Paquete savePaquete(Paquete paquete) {
        return paqueteRepository.save(paquete);
    }

    @Override
    public List<Paquete> getAllPaquetes() {
        return paqueteRepository.findAll();
    }
}

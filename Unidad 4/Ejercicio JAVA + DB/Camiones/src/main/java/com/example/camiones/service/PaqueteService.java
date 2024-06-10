package com.example.camiones.service;

import com.example.camiones.connections.HibernateUtil;
import com.example.camiones.dto.PaqueteDto;
import com.example.camiones.entities.Camion;
import com.example.camiones.entities.Paquete;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.nio.file.SecureDirectoryStream;

public class PaqueteService {
    private static final Logger logger = LoggerFactory.getLogger(PaqueteService.class);

    public void addPaquete(PaqueteDto paqueteDto){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()){
            Camion camion = session.get(Camion.class, paqueteDto.getCamionAsignado());
            if (camion != null) {
                transaction = session.beginTransaction();
                Paquete paquete = new Paquete();
                paquete.setAltura(paqueteDto.getAltura());
                paquete.setPeso(paqueteDto.getPeso());
                paquete.setProfundidad(paqueteDto.getProfundidad());

                camion.addPaquete(paquete);

                session.persist(paquete);
                session.merge(camion);
                transaction.commit();

                logger.info("Paquete agregado con exito "+ paquete);
            }else{
                logger.warn("No se encontro el camion con la ID: " + paqueteDto.getCamionAsignado());
            }
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            logger.error("Error aregando un paquete " + paqueteDto);
        }
    }

    public void updatePaquete(PaqueteDto paqueteDto){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSession()){
            transaction = session.beginTransaction();

            Paquete paquete = session.get(Paquete.class,paqueteDto.getId());
            if(paquete != null){
                paquete.setCamionAsignado(paqueteDto.getCamionAsignado());
                paquete.setAltura(paqueteDto.getAltura());
                paquete.setPeso(paqueteDto.getPeso());
                paquete.setProfundidad(paqueteDto.getProfundidad());

                session.merge(paquete);
                transaction.commit();

                logger.info("Paquete actualizado con exito " + paquete);
            }else{
                logger.warn("No se encontro el paquete con la ID: " + paqueteDto.getId());
            }
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            logger.error("Error al actualizar paquete " + paqueteDto);
        }
    }

    public void rmPaquete(int id){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSession()){
            transaction = session.beginTransaction();
            Paquete paquete = session.get(Paquete.class,id);
            if(paquete != null){
                session.remove(paquete);
                transaction.commit();
                logger.info("Se elimino el paquete con exito "+ paquete);
            }else{
                logger.warn("No se encontro el paquete con la ID: " + id);
            }
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            logger.error("Error al intentar eliminar paquete");
        }
    }
}

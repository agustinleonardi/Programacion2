package com.example.camiones.service;

import com.example.camiones.connections.HibernateUtil;
import com.example.camiones.dto.CamionDto;
import com.example.camiones.entities.Camion;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CamionService {
    private static final Logger logger = LoggerFactory.getLogger(CamionService.class);

    public void addCamion(CamionDto camionDto){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSession()){
            transaction = session.beginTransaction();

            //aca convertimos el DTO a entidad Camion
            Camion camion = new Camion();
            camion.setMarca(camionDto.getMarca());
            camion.setModelo(camion.getModelo());
            camion.setNombreConductor(camion.getNombreConductor());

            session.persist(camion);
            transaction.commit();

            logger.info("Camion añadido con exito", camion);

        }catch(Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            logger.error("Error añadiendo camion" + e);
        }

    }

    public void rmCamion(int id){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()){
            transaction = session.beginTransaction();   //aqui comienza la transaccion, cualquier operacion de base de datos realizada despues de este punto es parte de esta transaccion

            //encuantra al camion por su id, si el camion se encuentra, se elimina
            //"transaction.commit();" confirma la trasnaccion, aplicando todos los cambios realizados dentro de ella de manera permanente
            Camion camion = session.get(Camion.class,id);
            if(camion != null) {
                session.remove(camion);
                transaction.commit();
            }else {
                logger.warn("No se encontro el camion con la id: " + id);
            }
        }catch (Exception exception){
            if(transaction != null){
                transaction.rollback(); //sirve para deshacer la transaccion si hay una excepcion
            }
            logger.error("Error eliminando camion con ID: "+ id, exception);
        }
    }

    public void updateCamion (CamionDto camionDto){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()){
            transaction = session.beginTransaction();

            Camion camion = session.get(Camion.class,camionDto.getId());
            if(camion != null){
                camion.setNombreConductor(camionDto.getNombreConductor());
                camion.setMarca(camionDto.getMarca());
                camion.setModelo(camionDto.getModelo());

                session.update(camion);
                transaction.commit();

                logger.info("Camion actualizado con exito: {}", camion);
            } else {
              logger.warn("No se encontro el camion con la ID: " + camionDto.getId());
            }
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            logger.error("Error al actualizar camion");
        }
    }
}

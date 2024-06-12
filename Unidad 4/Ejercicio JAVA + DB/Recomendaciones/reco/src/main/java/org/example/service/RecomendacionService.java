package org.example.service;

import org.example.connections.HibernateUtil;
import org.example.dto.ProductoDto;
import org.example.entity.Producto;
import org.example.entity.Recomendacion;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RecomendacionService {
    private static final Logger logger = LoggerFactory.getLogger(RecomendacionService.class);

    public void addRecomendacionProducto(int producto_id, String texto, int valoracion){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()){
           transaction = session.beginTransaction();

           Producto producto = session.get(Producto.class, producto_id);
           if(producto != null){
               Recomendacion recomendacion = new Recomendacion();
               recomendacion.setProducto(producto);
               recomendacion.setTexto(texto);
               recomendacion.setValoracion(valoracion);

               session.persist(recomendacion);
               transaction.commit();

               logger.info("Se agrego la recomendacion con exito");
           }else{
               logger.warn("no se enconro el producto con la ID: " + producto_id);
           }
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            logger.error("Error al crear una recomendacion");
        }


    }
}

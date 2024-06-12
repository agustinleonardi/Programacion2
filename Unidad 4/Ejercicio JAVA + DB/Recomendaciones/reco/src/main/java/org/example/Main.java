package org.example;

import org.example.entity.Recomendacion;
import org.example.service.RecomendacionService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RecomendacionService recomendacionService = new RecomendacionService();

        int productoId = 1;
        String texto = "Este es un gran producto, muy recomendable";
        int valoracion = 5;

        recomendacionService.addRecomendacionProducto(productoId,texto,valoracion);

    }
}
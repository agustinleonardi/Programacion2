package com.example.integradorunidad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class IntegradorUnidad1Application {

    public static void main(String[] args) {
        SpringApplication.run(IntegradorUnidad1Application.class, args);
        ProductSelector productSelector = new ProductSelector();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la categoria del producto (electronica | vehiculo | ropa)");
        String categoria = scanner.nextLine();

        System.out.println("igrese nombre de producto");
        String nombre = scanner.nextLine();

        System.out.println("ingrese el precio del producto");
        double precio = scanner.nextDouble();

        Producto prod = productSelector.selectProduct(categoria,nombre,precio);
        System.out.println(prod.toString());
    }

}

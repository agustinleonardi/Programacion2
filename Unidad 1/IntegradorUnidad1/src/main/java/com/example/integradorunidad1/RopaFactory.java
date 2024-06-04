package com.example.integradorunidad1;

public class RopaFactory extends ProductFactory {
    @Override
    public Producto createProduct(String nombre, double precio) {
        return new Ropa(nombre,precio);
    }
}

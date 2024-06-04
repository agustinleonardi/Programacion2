package com.example.integradorunidad1;

public class VehiculoFactory extends ProductFactory{
    @Override
    public Producto createProduct(String nombre, double precio) {
        return new Vehiculo(nombre,precio);
    }
}

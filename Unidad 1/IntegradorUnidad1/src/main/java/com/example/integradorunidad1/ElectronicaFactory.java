package com.example.integradorunidad1;

public class ElectronicaFactory extends ProductFactory{
    @Override
    public Producto createProduct(String nombre, double precio) {
        return new Electronica(nombre,precio);
    }
}

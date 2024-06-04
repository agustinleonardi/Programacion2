package com.example.integradorunidad1;

public class Vehiculo extends Producto{
    private String tipo;

    public Vehiculo(String nombre, double precio) {
        super(nombre,precio);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}

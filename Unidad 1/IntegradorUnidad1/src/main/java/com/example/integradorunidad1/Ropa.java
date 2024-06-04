package com.example.integradorunidad1;

public class Ropa extends Producto{
    private String talla;
    public Ropa(String nombre, double precio) {
        super(nombre, precio);
        this.talla=talla;
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

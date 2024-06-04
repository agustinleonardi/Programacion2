package com.example.integradorunidad1;

import lombok.Getter;

@Getter
public abstract class Producto implements Product{
    private String Nombre;
    private double Precio;
    private String Descripcion;

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Producto(String nombre, double precio) {
        this.Nombre=nombre;
        this.Precio=precio;
    }

    @Override
    public String toString() {
        return "";
    }
}

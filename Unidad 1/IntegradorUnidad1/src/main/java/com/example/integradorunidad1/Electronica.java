package com.example.integradorunidad1;

public class Electronica extends Producto{

    public Electronica(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override
    public String getDescription() {
        return "este es de electronica";
    }
    @Override
    public double getPrice() {
        return getPrecio();
    }
    @Override
    public String toString() {
        return super.toString() +
                "Electronica{" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Precio=" + super.getPrecio() +
                ", Descripcion='" + super.getDescripcion() + '\'' +
                '}';
    }
}

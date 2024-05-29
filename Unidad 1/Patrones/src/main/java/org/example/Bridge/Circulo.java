package org.example.Bridge;

public class Circulo extends Forma{
    public Circulo (Color color){
        super(color);
    }
    @Override
    public void dibujar() {
        System.out.println("dibujando un circulo con ");
        color.aplicar();
    }
}

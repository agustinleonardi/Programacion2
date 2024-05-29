package org.example.Bridge;

public class Cuadrado extends Forma{
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un cuadrado con ");
        color.aplicar();
    }
}

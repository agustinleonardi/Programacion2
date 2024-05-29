package org.example.Bridge;

abstract class Forma {
    public Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}

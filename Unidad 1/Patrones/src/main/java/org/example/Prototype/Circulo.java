package org.example.Prototype;

public class Circulo implements IClonable {
    private int radio;
    private int centro;

    public Circulo(int radio, int centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Override
    public Circulo clonar() {
        return new Circulo(this.radio,this.getCentro());
    }
}

package org.example.Builder;

public class Auto {
    private String marca;
    private String modelo;
    private String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Builder{
        private Auto auto;

        public Builder(){
            auto = new Auto();
        }

        public Builder marca(String marca){
            auto.marca=marca;
            return this;
        }

        public Builder modelo(String modelo){
            auto.modelo= modelo;
            return this;
        }
        public Builder color(String color){
            auto.color=color;
            return this;
        }
        public Auto build (){
            return auto;
        }
    }
}

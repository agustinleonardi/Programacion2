package ejercicios.ejer6;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String numeroRuedas;

    public Vehiculo(String marca, String modelo, String numeroRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRuedas = numeroRuedas;
    }

    public String obtenerPropiedades(){
        return "marca: " + marca + ", modelo: " + modelo + ", numero de ruedas:" + numeroRuedas;
    }
}

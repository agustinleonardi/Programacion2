package ejercicios.ejer6;

public class Coche extends Vehiculo{
    private String numeroPasajeros;

    public Coche(String marca, String modelo, String numeroRuedas, String numeroPasajeros) {
        super(marca, modelo, numeroRuedas);
        this.numeroPasajeros = numeroPasajeros;
    }

    public String obtenerPropiedades() {
        return super.obtenerPropiedades()+ this.numeroPasajeros;
    }

}

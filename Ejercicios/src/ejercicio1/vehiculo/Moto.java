package ejercicio1.vehiculo;

public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String marca, String modelo, String numeroRuedas, String cilindrada) {
        super(marca, modelo, numeroRuedas);
        this.cilindrada = cilindrada;
    }

    public String obtenerPropiedades() {
        return super.obtenerPropiedades()+ this.cilindrada;
    }

}

package ejercicio1.vehiculo;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, String cantidadRuedas, String cantidadpuertas) {
        super(marca,modelo,cantidadRuedas);
        this.cantidadpuertas = cantidadpuertas;
    }

    private String  cantidadpuertas;

    @Override
    public String obtenerPropiedades() {
        return super.obtenerPropiedades()+ ", cantidad de puertas: " + this.cantidadpuertas;
    }
}

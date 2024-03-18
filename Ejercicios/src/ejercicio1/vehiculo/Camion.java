package ejercicio1.vehiculo;

public class Camion extends Vehiculo{
    private Long cantidadRuedas;

    @Override
    public Long propiedades() {
        return super.propiedades()+ this.getCantidadRuedas();
    }

    public Long getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(Long cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }
}

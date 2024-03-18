package ejercicio1.vehiculo;

public class Coche extends Vehiculo{
    private Long numeroPasajeros;

    @Override
    public Long propiedades() {
        return super.propiedades()+ this.getNumeroPasajeros();
    }

    public Long getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Long numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
}

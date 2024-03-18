package ejercicio1.vehiculo;

public class Moto extends Vehiculo{
    private Long cilindrada;

    @Override
    public Long propiedades() {
        return super.propiedades()+ this.getCilindrada();
    }

    public Long getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Long cilindrada) {
        this.cilindrada = cilindrada;
    }
}

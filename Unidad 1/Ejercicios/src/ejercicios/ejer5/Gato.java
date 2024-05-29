package ejercicios.ejer5;

public class Gato extends Animal{

    @Override
    public String comunicacion() {
        return super.comunicacion()+ "Este Gato maulla";
    }
}

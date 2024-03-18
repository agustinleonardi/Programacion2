package ejercicio1.animal;

public class Gato extends Animal{

    @Override
    public String comunicacion() {
        return super.comunicacion()+ "Este Gato maulla";
    }
}

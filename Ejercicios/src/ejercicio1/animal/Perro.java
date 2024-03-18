package ejercicio1.animal;

public class Perro extends Animal{

    @Override
    public String comunicacion() {
        return super.comunicacion()+"este Perro ladra";
    }
}

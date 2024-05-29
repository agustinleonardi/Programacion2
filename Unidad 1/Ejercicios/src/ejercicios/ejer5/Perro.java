package ejercicios.ejer5;

public class Perro extends Animal{

    @Override
    public String comunicacion() {
        return super.comunicacion()+"este Perro ladra";
    }
}

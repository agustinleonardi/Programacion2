package ejercicio1;

public class Estudiante {
    private String nombre;
    private String apellido;
    private Long edad;

    private Long numeroID;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public Long getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(Long numeroID) {
        this.numeroID = numeroID;
    }
}

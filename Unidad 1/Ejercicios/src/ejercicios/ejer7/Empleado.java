package ejercicios.ejer7;

public class Empleado {
    private String nombre;

    private double salario;
    private String departamento;
    public double getSalario() {
        return salario;
    }
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
}

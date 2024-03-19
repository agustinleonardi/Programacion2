import ejercicio1.Calculadora;
import ejercicio1.Punto;
import ejercicio1.empleado.Director;
import ejercicio1.empleado.Empleado;
import ejercicio1.empleado.Programador;
import ejercicio1.vehiculo.Camion;
import ejercicio1.vehiculo.Vehiculo;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(6, 2);
        System.out.println(p1.calcularDistancia(p2));
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(3,3));
        System.out.println(calculadora.restar(3,3));
        System.out.println(calculadora.dividir(3,3));
        System.out.println(calculadora.multiplicar(3,3));

        Vehiculo camion = new Camion("2", "ford", "3", "4");
        System.out.println(camion.obtenerPropiedades());

        //ejercicio empleado
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Programador("agustin", 200, "castellanos"));
        empleados.add(new Director("gaston", 300, "castellanos"));
        
        double salariototal = 0;
        for (Empleado empleado : empleados) {
            salariototal+= empleado.getSalario();
        }
        System.out.println("el salario total de todos los empleados de la empresa es: "+salariototal);
        Integer numero = scanner.nextInt();
    }
}
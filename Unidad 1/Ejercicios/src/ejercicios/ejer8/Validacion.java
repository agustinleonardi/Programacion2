package ejercicios.ejer8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    public static boolean validacionDni(String input){
        String regex = "\\d{8}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean validacionCuit(String input){
        String regex = "\\d{11}";  //Define una cadena de texto regex que contiene la expresión regular \\d{11}. Esta expresión significa que el patrón a buscar es una secuencia de exactamente 11 dígitos (\d representa un dígito y {11} especifica que debe haber 11 de estos).
        Pattern pattern = Pattern.compile(regex);   //3-Usa la clase Pattern para compilar la expresión regular definida en regex en un objeto Pattern. Este objeto se utilizará para crear un Matcher que pueda evaluar si una cadena dada cumple con el patrón.
        Matcher matcher = pattern.matcher(input);   //4-Crea un objeto Matcher llamado matcher que se usará para verificar si la cadena input coincide con el patrón definido por el objeto Pattern. La verificación se realiza en la llamada a matches().
        return matcher.matches();  //Llama al método matches() del objeto Matcher, que evalúa si la cadena input completa coincide con el patrón definido en regex. Devuelve true si input cumple con el patrón (es decir, si consiste exactamente en 11 dígitos), y false en caso contrario
    }
    //En resumen, el punto 3 convierte la expresión regular en un objeto Pattern, lo que significa preparar el patrón para su uso, y el punto 4 crea un objeto Matcher basado en ese patrón, listo para aplicar la operación de coincidencia en la cadena input.
    //
    public static boolean validacionNombre(String input){
        String regex = "[A-Za-z]+([ '][A-Za-z]+)*";
        //[A-Za-z]+: El nombre debe comenzar con una o más letras (mayúsculas o minúsculas).
        //([ '][A-Za-z]+)*: El nombre puede contener espacios o apóstrofes seguidos por una o más letras, y este patrón puede repetirse cero o más veces (para permitir nombres compuestos o apellidos).
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean validacionNumeroPositivo(String input){
        String regex = "^[+]?\\d+$";//^: indica el inicio de la cadena, [+]: indica el signo, /d indica q debe haber uno o mas digitos, $ el final de la cadena
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean validacionNumeroNegativo(String input){
        String regex = "^[-]?\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean validacionNumeroRealConDecimal(String input){
        String regex = "^-?\\d+\\.\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean validacionPatente(String input){
        String regex = "^\\d{3}[A-Z]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    } public static boolean validacionFecha(String input){
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}


/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase ");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }
}

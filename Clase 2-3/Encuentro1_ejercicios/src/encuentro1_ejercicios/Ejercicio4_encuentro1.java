/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package encuentro1_ejercicios;

import java.util.Scanner;

public class Ejercicio4_encuentro1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una temperatura en °C para convertir a Fahrenheit"); 
        float temperatura = leer.nextInt();
        float F = 32 + (9 * temperatura / 5);
        System.out.println(temperatura + "°C son equivalentes a : " + F + " grados Fahrenheit");
    }
}

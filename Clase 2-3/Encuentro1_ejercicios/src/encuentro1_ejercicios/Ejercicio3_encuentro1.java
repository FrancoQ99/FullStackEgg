/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package encuentro1_ejercicios;

import java.util.Scanner;


public class Ejercicio3_encuentro1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase : ");
        String frase = leer.nextLine();
        System.out.println("La frase ingresada en mayusculas es : " + frase.toUpperCase());
        System.out.println("La frase ingresada en minusculas es : " + frase.toLowerCase());
    }
}
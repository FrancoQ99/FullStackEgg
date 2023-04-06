/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner ( System.in);
        System.out.println("Ingrese una frase para saber si tiene 8 caracteres");
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }
}

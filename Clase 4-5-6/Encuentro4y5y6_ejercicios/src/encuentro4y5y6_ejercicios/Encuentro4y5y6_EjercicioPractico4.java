/*
 Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        String letra = frase.substring(0,1);
        
        if (letra.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
            
        }
    }

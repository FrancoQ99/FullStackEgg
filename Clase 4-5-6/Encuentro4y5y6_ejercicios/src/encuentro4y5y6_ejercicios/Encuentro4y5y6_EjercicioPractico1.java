/*
Crear un programa que dado un número determine si es par o impar
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int num = leer.nextInt(); 
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        }
        else {
            System.out.println("El numero ingresado es impar");
    }
    }
}
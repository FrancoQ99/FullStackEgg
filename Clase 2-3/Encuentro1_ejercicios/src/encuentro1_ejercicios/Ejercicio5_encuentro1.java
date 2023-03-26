/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package encuentro1_ejercicios;

import java.util.Scanner;


public class Ejercicio5_encuentro1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero"); 
        int n1 = leer.nextInt();
        System.out.println("El doble de " + n1 + " es : " + n1*2);
        System.out.println("El triple de " + n1 + " es : " + n1*3);
        System.out.println("La raiz cuadrada de " + n1 + " es : " + Math.sqrt(n1));
    }
 
}

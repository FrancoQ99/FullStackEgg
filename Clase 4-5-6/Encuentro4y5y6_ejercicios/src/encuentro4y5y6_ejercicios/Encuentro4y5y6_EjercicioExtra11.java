/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra11 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero:");
        int truncado , contador = 1 , numero = leer.nextInt();
        do {
            truncado = numero / 10;
            contador++;
            numero = truncado ;
        } while (numero/10 != 0 );
        System.out.println("La cantidad de digitos del numero ingresado es: " + contador);
    }
     
}

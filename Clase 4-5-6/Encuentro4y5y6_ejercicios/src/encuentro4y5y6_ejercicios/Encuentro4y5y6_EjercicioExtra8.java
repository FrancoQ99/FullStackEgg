/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int par = 0, impar = 0, cantidad , n , contador = 1;
        while (true) {            
            System.out.println("Ingrese un numero ");
            n = leer.nextInt();
            if (n % 2 == 0) {
                par++;
            }
            else{
            impar++;
            }
            if (n < 0 || n % 5 == 0 ) {
                break;
            }
            contador++;
        }
       
        
       System.out.println("La cantidad de numeros pares ingresados son : " + par);
       System.out.println("La cantidad de numeros impares ingresados son  : " + impar);
        System.out.println("Cantidad de numeros ingresados : " + contador);
        }
}
/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra7 {
    public static void main(String[] args) {
    /*     Scanner leer = new Scanner (System.in);
        int max = 0, min , n , numeros , suma = 0 , contador = 1;
        float  promedio;
        System.out.println("Ingrese la cantidad de numeros que quiera ingresar: ");
        n = leer.nextInt();  
        min = 9999999 ;
        while ( contador <= n) {  
            
               System.out.println("Ingrese un numero :");
                numeros = leer.nextInt();
                
            if (numeros > max) {
                max = numeros ;
            }
            if (numeros < min) {
                min = numeros ;
            }
            
             suma += numeros ;
             contador++;
            
            
        }
        promedio = suma/n;
        System.out.println("El numero mas grande ingresado es : " + max);
        System.out.println("El numero mas chico ingresado es : " + min);
        System.out.println("El promedio de los numeros ingresados es : " + promedio);
*/      Scanner leer = new Scanner (System.in);
        int contador = 0 , max = 0, min = 999999 , numeros , suma = 0 , n ;
        double  promedio;
        System.out.println("Ingrese la cantidad de numeros que quiera ingresar ");
        n = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero :");
            numeros = leer.nextInt();
            contador++;
            if (numeros > max) {
                max = numeros;
            }
            if (numeros < min) {
                min = numeros ;
            }
            suma += numeros;
              
        } while (contador < n);
        promedio = suma/n;
        System.out.println("El numero mas grande ingresado es : " + max);
        System.out.println("El numero mas chico ingresado es : " + min);
        System.out.println("El promedio de los numeros ingresados es : " + promedio);
    }
}

/*
Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
*/
package encuentro1_ejercicios;

import java.util.Scanner;

public class Ejercicio1_encuentro1 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in) ;
     System.out.println("Ingrese el primer numero");
     int n1 = leer.nextInt() ; 
     System.out.println("Ingrese el segundo numero");
     int n2 = leer.nextInt();
     int suma = n1 + n2;
     System.out.println("La suma del primer numero y el segundo numero es : " + suma );
     
    }
    
}

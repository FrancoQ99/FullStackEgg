/*
Implementar un programa 
que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioTeoria1 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in );
        System.out.println("Ingrese el primer numero");
       int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = leer.nextInt();
        
        if (n1 > 25 && n2 > 25) {
            System.out.println("Ambos numeros son mayor a 25");
        }
        else if (n1 > 25 && n2 < 25) {
            System.out.println("Solo el primer numero es mayor a 25");
        }
        else if (n1 < 25 && n2 > 25) {
            System.out.println("Solo el segundo numero es mayor a 25");
        }
        else  {
            System.out.println("Ninguno de los 2 numeros es mayor a 25");
        }
            
        }
        }
      
   
    


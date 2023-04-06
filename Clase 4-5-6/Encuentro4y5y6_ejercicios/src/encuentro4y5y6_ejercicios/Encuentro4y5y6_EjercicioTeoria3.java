/*
Escriba un programa que valide si una nota 
está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioTeoria3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in) ;
        System.out.println("Ingrese una nota :");
        int nota = leer.nextInt();
        while (nota <0 || nota >10) {            
            System.out.println("Nota invalida, ingrese otra nota");
            nota = leer.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota correcta");
            }
    }
   
  
}
}
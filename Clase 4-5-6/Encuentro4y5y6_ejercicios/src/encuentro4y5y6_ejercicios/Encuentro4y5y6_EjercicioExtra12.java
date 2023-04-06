/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for ( int k = 0; k < 10; k++){
                    String digito_1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito_2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito_3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito_1 + "-" + digito_2 + "-" + digito_3);
                }
                
            }
        }
    }
    
} 
  

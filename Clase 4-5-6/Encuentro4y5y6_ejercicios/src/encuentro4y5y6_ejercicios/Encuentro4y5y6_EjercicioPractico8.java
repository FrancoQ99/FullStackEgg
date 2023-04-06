/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioPractico8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del cuadrado :");
        int tamaño = leer.nextInt();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                 if (i == 0 || i == tamaño-1 || j == 0 || j == tamaño-1) {
                     System.out.print(" * ");
                 }
                 else{
                     System.out.print("   ");
                 }          
            }
             
            System.out.println(" ");
            
        }
    }
}

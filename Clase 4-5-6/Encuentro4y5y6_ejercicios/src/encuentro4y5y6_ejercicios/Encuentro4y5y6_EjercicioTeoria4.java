/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioTeoria4 {
    public static void main(String[] args) {
        int suma = 0 ;
        int contador = 1 ;
        int num;
       
        do {
             Scanner leer = new Scanner (System.in);
             System.out.println("Ingrese un numero o presione 0 para detener el bucle");
             num = leer.nextInt();
           contador++;
            if (num > 0) {
                suma = suma + num ;
            }
            if (num == 0) {
                break;
            }
        } while ( contador < 20);
        System.out.println("Se capturo el numero cero"); 
        System.out.println("La suma total de todos los numeros ingresados es : " + suma);
              
    }
 
}

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        int num ;
        while (suma < limite) {            
             System.out.println("Ingrese un numero :");
             num = leer.nextInt();
             suma = suma + num ;
        }
        System.out.println("El valor limite es : " + limite);
        System.out.println("La suma total de los numeros ignresados es : " + suma);
        System.out.println("Has sobrepasado el valor limite");
    }
}

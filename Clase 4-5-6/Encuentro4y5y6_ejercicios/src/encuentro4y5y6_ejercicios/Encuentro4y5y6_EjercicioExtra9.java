/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra9 {
    public static void main(String[] args) {
        int cociente = 0, dividendo , divisor ,resto ; 
        Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese el dividendo");
            dividendo = leer.nextInt();
            System.out.println("Ingrese el divisor");
            divisor = leer.nextInt();
        do {
            
            resto = dividendo - divisor ;
            cociente++;
            System.out.println(dividendo + " - " + divisor + " = " + resto + " // " + cociente + " resta realizada");
            dividendo = resto ;
            
        } while (dividendo > divisor);
        System.out.println("Dado que el dividendo " + dividendo + " es menor que el divisor " + divisor + " entonces : el residuo es " + dividendo + " y el cociente es " + cociente);   
    }
}

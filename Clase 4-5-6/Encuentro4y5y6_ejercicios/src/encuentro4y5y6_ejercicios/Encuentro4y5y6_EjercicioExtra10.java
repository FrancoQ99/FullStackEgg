/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra10 {
    public static void main(String[] args) {
        int n1 , n2 , resultado , adivinar;
        Scanner leer = new Scanner(System.in);
        n1 = (int) (Math.random()*11)  ;
        n2 =  (int) (Math.random()*11) ;
       // System.out.println(n1);
       //System.out.println(n2);
        resultado = n1*n2;
        System.out.println("Adivine el resultado de la multiplicacion de los numeros aleatorios");
        do {
            adivinar = leer.nextInt();
            if (adivinar != resultado) {
                System.out.println("Respuesta incorrecta");
            }
        } while (adivinar != resultado);
        System.out.println("Respuesta correcta, has adivinado!");
        System.out.println("El resultado era : " + resultado);
    }
}

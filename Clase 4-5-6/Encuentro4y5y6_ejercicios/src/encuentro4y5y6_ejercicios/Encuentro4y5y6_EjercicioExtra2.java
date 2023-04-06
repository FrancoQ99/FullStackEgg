/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int A , B , C , D , AUX ;
        System.out.println("Ingrese un valor para la variable A");
        A = leer.nextInt();
        System.out.println("Ingrese un valor para la variable B");
        B = leer.nextInt();
        System.out.println("Ingrese un valor para la variable C");
        C = leer.nextInt();
        System.out.println("Ingrese un valor para la variable D");
        D = leer.nextInt();
        System.out.println("El valor inicial de la variable A es : " + A);
        System.out.println("El valor inicial de la variable B es : " + B);
        System.out.println("El valor inicial de la variable C es : " + C);
        System.out.println("El valor inicial de la variable D es : " + D);
        
        AUX = B ;
        B = C ;
        C = A ;
        A = D ;
        D = AUX ;
        System.out.println("El nuevo valor de la variable A es : " + A);
        System.out.println("El nuevo valor de la variable B es : " + B);
        System.out.println("El nuevo valor de la variable C es : " + C);
        System.out.println("El nuevo valor de la variable D es : " + D);
       
    }
    
}

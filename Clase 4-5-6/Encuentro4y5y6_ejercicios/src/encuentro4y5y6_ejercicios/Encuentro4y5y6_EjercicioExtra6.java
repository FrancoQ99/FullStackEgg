/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas para averiguar el promedio de estatura");
        int personas = leer.nextInt() , contadorPetisos = 0;
        float estatura = 0 ,estaturaGeneral = 0, estaturaMenor = 0, promedioGeneral = 0 , promedioMenor = 0 ;
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la estatura de la persona N°:" + (i+1));
            estatura = leer.nextFloat();
            if (estatura < 1.60) {
                estaturaMenor = estaturaMenor + estatura ;
                contadorPetisos++;
            }
            
          estaturaGeneral = estaturaGeneral + estatura;  
        }
        promedioGeneral = estaturaGeneral/personas;
        promedioMenor = estaturaMenor/contadorPetisos;
        System.out.println("El promedio de estatura de las personas que miden menos de 1.60mts es : " + promedioMenor); 
        System.out.println("El promedio general de estatura de las personas es : " + promedioGeneral);
    }
}

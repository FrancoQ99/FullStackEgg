/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int cantFamilias, cantHijos , edad , sumaEdad = 0, hijos = 0 ;
        double promedioEdad;
        System.out.println("Ingrese la cantidad de familias : ");
        cantFamilias = leer.nextInt();
        for (int i = 0; i < cantFamilias ; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia n° :" + (i+1));
            cantHijos = leer.nextInt();
            for (int j = 0; j < cantHijos ; j++) {
                System.out.println("Ingrese la edad del hijo n° : " + (j+1));
                edad = leer.nextInt();
                sumaEdad+=edad;
                hijos++;
            }
        }
        promedioEdad = sumaEdad/hijos;
        System.out.println("La cantidad total de hijos es : " + hijos );
        System.out.println("El promedio de edad de todos los hijos es : " + promedioEdad);
    }  
    }


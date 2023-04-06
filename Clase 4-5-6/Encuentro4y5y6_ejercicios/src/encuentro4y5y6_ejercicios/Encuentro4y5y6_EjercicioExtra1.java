/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra1 {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una cantidad de minutos a transformar en dias y horas ");
       int minutos = leer.nextInt();
       int dias = minutos / 1440 ; // 1440 son los minutos que tiene un dia 
       int MinutosRestantes = minutos % 1440 ; // MinutosRestantes es el resultado del residuio de la 
       //cantidad de minutos sobre 1440
       int horas = MinutosRestantes / 60 ;
       
        System.out.println(dias + " dias " + horas + " horas");
        
        
    }
}
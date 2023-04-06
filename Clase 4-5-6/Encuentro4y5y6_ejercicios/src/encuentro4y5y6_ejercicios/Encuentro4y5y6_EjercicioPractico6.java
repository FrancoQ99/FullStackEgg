/*
 Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;


public class Encuentro4y5y6_EjercicioPractico6 {
    public static void main(String[] args) {
        int opcion , num1 , num2 ;
        String eleccion ;
        Scanner leer = new Scanner (System.in);
        
        do{        
        System.out.println("Ingrese un numero entero positivo");
         num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
         num2 = leer.nextInt();
        }while(num1 < 0 && num2 < 0);
      
 
        do {
        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción: ");
        opcion = leer.nextInt();
            
                switch (opcion) {
                case 1:
                    int n3 = num1 + num2 ;
                    System.out.println("La suma de los numeros ingresados es : " + n3);
                    break;
                case 2 :
                    n3 = num1 - num2 ;
                    System.out.println("La resta de los dos numeros ingresado es : " + n3);
                    break;
                case 3 :
                    n3 = num1 * num2 ;
                    System.out.println("La multiplicacion de los dos numeros ingresados es : " + n3);
                    break;
                case 4:
                    n3 = num2 / num1 ;
                    System.out.println("La division de los dos numeros ingresados es : " + n3);
                    break;
                case 5 :
                    System.out.println("Saliendo del menu");
                    if (opcion==5) {
                       System.out.println("Esta seguro que desea salir del programa ? (S/N)");
                     eleccion = leer.next(); 
                     eleccion = eleccion.toLowerCase();
                    if(eleccion.equals("s")){
                            System.out.println("Saliste con exito");
                            break;
                    }else{
                            System.out.println("Volviendo al menu");
                            opcion = 0;
                        }
                    }
            }
           
        }   
            while (opcion != 5);
            
        } 
        
       
        }

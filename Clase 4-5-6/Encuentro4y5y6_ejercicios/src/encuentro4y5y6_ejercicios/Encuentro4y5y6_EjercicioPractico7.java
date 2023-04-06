/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo:
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
Substring(), Length(), equals().
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioPractico7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase ;
        int LecturaCorrecta = 0 , LecturaIncorrecta = 0;
        
        do {
            System.out.println("Ingrese una cadena");
            frase = leer.nextLine();
            if (frase.equals("&&&&&")){
                break;
            }
            
            
            if (frase.length() == 5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O)")) {
                LecturaCorrecta++;
            }
                else{
                LecturaIncorrecta++;
                        }
    
            }while (true);
       System.out.println("La cantidad de cadenas ingresadas de manera incorrecta fueron : " + LecturaIncorrecta);
        System.out.println("La cantidad de cadenas ingresadas de manera correcta fueron : " + LecturaCorrecta);
    }
}
    

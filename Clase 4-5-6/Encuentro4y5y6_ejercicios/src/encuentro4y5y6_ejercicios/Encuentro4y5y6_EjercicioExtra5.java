/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio
 */
package encuentro4y5y6_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Encuentro4y5y6_EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int CuotaA = 10000 , CuotaB = 7500 , CuotaC = 5000 , tratamiento;
        System.out.println("Bienvenido a Obra Social. Seleccione su nivel de socio : A , B , C "); 
        char TipoSocio = leer.next().charAt(0);
        switch (TipoSocio) {
            case 'A':
                System.out.println("Ingrese el valor del tratamiento");
                tratamiento = leer.nextInt();
                System.out.println("Al ser socio tipo A , tiene un 50% de descuento en el tratamiento , el monto final a abonar es : " + (tratamiento*0.5+CuotaA));
                break;
            case 'B' :
                System.out.println("Ingrese el valor del tratamiento");
                tratamiento = leer.nextInt();
                System.out.println("Al ser socio tipo b , tiene un 35% de descuento en el tratamiento , el monto final a abonar es : " + (tratamiento*0.65+CuotaB));
                break;
            case 'C' :
                System.out.println("Ingrese el valor del tratamiento");
                tratamiento = leer.nextInt();
                System.out.println("Al ser socio tipo c , no tiene descuento en el tratamiento , el monto final a abonar es : " + (tratamiento+CuotaC));
                break;
            default:
                throw new AssertionError();
        }
       
    }
}


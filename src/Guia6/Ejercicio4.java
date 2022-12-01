/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un temperatura en grados centígrados: ");
        float centigrados = entrada.nextFloat();

        float fahren = 32 + (9 * centigrados / 5);

        System.out.println("La temperatura en grados centigrados "
                + centigrados + " en Fahrenheit es: " + fahren);
        
        
    }
    
}

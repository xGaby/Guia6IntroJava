/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un valor límite positivo: ");

        int limPos = entrada.nextInt();
        
        int suma = 0;
        
        while (suma < limPos) {
            System.out.println("Escribir un número para sumar: ");
            int num = entrada.nextInt();
            suma = suma + num;
        }
        
        System.out.println("La suma es: "+ suma);
    }
    
}

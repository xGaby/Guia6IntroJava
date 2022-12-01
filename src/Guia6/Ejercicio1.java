/*
Escribir un programa que pida dos números enteros por teclado y calcule 
la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
        
        
    }
    
}

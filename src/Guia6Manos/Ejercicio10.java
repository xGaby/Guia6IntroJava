/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 */
package Guia6Manos;

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

        System.out.println("Ingrese 1er número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese 2do número: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Ingrese 3er número: ");
        int num3 = entrada.nextInt();
        
        System.out.println("Ingrese 4to número: ");
        int num4 = entrada.nextInt();

        
        System.out.print(num1 + " ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(num2 + " ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(num3 + " ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        System.out.print(num4 + " ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }

}

/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y 
lo muestre por pantalla.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Su nombre es: " + nombre);


    }
    
}

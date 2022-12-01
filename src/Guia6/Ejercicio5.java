/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();
        
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num));

        
    }
    
}

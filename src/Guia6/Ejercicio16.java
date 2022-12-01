/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese tamaño del vector: ");

        int n = entrada.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            //Math.random() * (MAX - MIN + 1)) + MIN; 
            vector[i] = (int) (Math.random() * 11);//numeros entre 0 y 10
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");

        System.out.println("Ingrese un número a buscar");

        int numero = entrada.nextInt();
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (numero == vector[i]) {
                System.out.println("La posicion es: " + i);
                contador = ++contador;
            }
        }

        System.out.println("El número está repetido " + contador + " veces");
    }

}

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Guia6;

/**
 *
 * @author Gabriela
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }

        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.print("[ " + vector[i] + "]");
        }
        System.out.println(" ");
    }

}

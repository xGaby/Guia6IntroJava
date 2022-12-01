/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano. 
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número (1 al 10): ");
        int num = entrada.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Número incorrecto. Ingrese nuevamente: ");
            num = entrada.nextInt();
        }

        String romano = "";

        if (num == 10) {
            romano = "X";
        } else if (num == 9) {
            romano = "IX";
        } else if (num >= 5) {
            romano = "V";
            for (int i = 6; i <= num; i++) {
                romano = romano + "I";
            }
        } else if (num == 4) {
            romano = "IX";
        } else {
            for (int i = 1; i <= num; i++) {
                romano = romano + "I";
            }
        }

        System.out.println("El número " + num + " en romano es: " + romano);

    }

}

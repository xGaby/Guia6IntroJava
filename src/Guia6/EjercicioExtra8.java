/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese números: ");

        int num;
        int contN = -1;
        int contP = 0;
        int contI = 0;

        do {

            num = entrada.nextInt();

            if (num % 2 == 0 && (num % 5 != 0) && num > 0) {
                contP = contP + 1;
            }

            if (num % 2 != 0 && (num % 5 != 0 && num > 0)) {
                contI = contI + 1;
            }

            contN = contN + 1;

            if (num < 0) {
                contN = contN - 1;
            }

        } while (num % 5 != 0);

        System.out.println("La cantidad de números es: " + contN);
        System.out.println("La cantidad de números pares: " + contP);
        System.out.println("La cantidad de números impares: " + contI);

    }

}

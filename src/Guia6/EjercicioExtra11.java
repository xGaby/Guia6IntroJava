/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");

        int num = entrada.nextInt();

        int cont = 1;

        while (num / 10 != 0) {

            num = num / 10;
            //System.out.println(num);
            cont = ++cont;

        }

        System.out.println("El número tiene " + cont + " digitos");

    }

}

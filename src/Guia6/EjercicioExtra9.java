/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.  
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese número 1: ");

        int num1 = entrada.nextInt();

        System.out.println("Ingrese número 2: ");

        int num2 = entrada.nextInt();

        int aux = 0;
        int cont = 0;

        while (num1 >= num2) {

            aux = num1 - num2;
            num1 = aux;
            cont = ++cont;
        }

        System.out.println("El cociente es: " + cont);
        System.out.println("El residuo es: " + aux);
    }

}

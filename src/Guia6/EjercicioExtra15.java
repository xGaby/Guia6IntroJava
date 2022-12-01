/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra15 {

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

        float resultado;

        System.out.println("Eliga la operación que desea realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                resultado = funcionSuma(num1, num2);
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = funcionResta(num1, num2);
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = funcionMultiplicacion(num1, num2);
                System.out.println("La multiplicación es: " + resultado);
                break;
            case 4:
                resultado = funcionDivision(num1, num2);
                System.out.println("La división es: " + resultado);
                break;
            default:
                throw new AssertionError();
        }

    }

    public static float funcionSuma(int num1, int num2) {

        float resultado;

        resultado = num1 + num2;

        return resultado;
    }

    public static float funcionResta(int num1, int num2) {

        float resultado;

        resultado = num1 - num2;

        return resultado;
    }

    public static float funcionMultiplicacion(int num1, int num2) {

        float resultado;

        resultado = num1 * num2;

        return resultado;
    }

    public static float funcionDivision(int num1, int num2) {

        float resultado;

        resultado = num1 / num2;

        return resultado;
    }

}

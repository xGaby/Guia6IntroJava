/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cantidad de euros: ");

        int euros = entrada.nextInt();

        System.out.println("Ingrese a que moneda desea convertir (dolares, yenes o libras): ");

        String moneda = entrada.next();

        cambioMoneda(euros, moneda);

    }

    public static void cambioMoneda(double euros, String moneda) {

        switch (moneda) {
            case "dolares":
                System.out.println(euros + " euros son " + (euros * 1.03) + " " + moneda);
                break;
            case "yenes":
                System.out.println(euros + " euros son " + (euros * 145.49) + " " + moneda);
                break;
            case "libras":
                System.out.println(euros + " euros son " + (euros * 0.87) + " " + moneda);
                break;
            default:
                break;
        }

    }
}

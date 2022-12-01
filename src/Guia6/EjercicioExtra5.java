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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tipo de socio (A, B o C): ");

        String socio = entrada.next();

        socio = socio.toUpperCase();

        System.out.println("Valor del tratamiento: ");

        int costo = entrada.nextInt();

        double pago = 0;

        switch (socio) {
            case "A":
                pago = costo * 0.50;
                break;
            case "B":
                pago = costo * 0.35;
                break;
            case "C":
                pago = costo;
                break;
            default:
                throw new AssertionError();
        }

        System.out.println("El socio de tipo " + socio + " paga un valor total de: " + pago);

    }

}

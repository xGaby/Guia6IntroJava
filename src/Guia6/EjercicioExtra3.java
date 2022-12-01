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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");

        String letra = entrada.next();

        String[] vocales = {"a", "e", "i", "o", "u"};

        boolean bandera = false;

        for (int i = 0; i < 5; i++) {
            if (letra.equals(vocales[i])) {
                System.out.println("Es una vocal");
                bandera = true;
                i = 5;
            }

        }

        if (bandera == false) {
            System.out.println("No es una vocal");
        }
    }

}

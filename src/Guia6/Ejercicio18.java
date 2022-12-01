/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Gabriela
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {

                matrizA[i][j] = (int) (Math.random() * 10); //numeros aleaotorios del 1 al 10

            }

        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {

                System.out.print("[" + matrizA[i][j] + "]");

            }
            System.out.println("");

        }

        System.out.println("La matriz traspuesta es: ");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {

                matrizB[i][j] = matrizA[j][i];
                System.out.print("[" + matrizB[i][j] + "]");

            }
            System.out.println("");

        }

    }

}

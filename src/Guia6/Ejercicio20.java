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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizA = new int[3][3];
        int[] sumaFi = new int[3];
        int[] sumaCol = new int[3];
        int[] sumaDia = new int[2];

        llenarMatriz(matrizA, 3);
        escribirMatriz(matrizA, 3);

        int suma;
        int sumaDP = 0;
        int sumaDS = 0;

        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + matrizA[i][j];

                if (i == j) {
                    sumaDP = sumaDP + matrizA[i][j];
                }
                if ((i + j) == (2)) {
                    sumaDS = sumaDS + matrizA[i][j];
                }
            }
            sumaFi[i] = suma;
            //System.out.println("Suma Fila " + i + ":" + suma);
        }

        for (int j = 0; j < 3; j++) {
            suma = 0;
            for (int i = 0; i < 3; i++) {
                suma = suma + matrizA[i][j];
            }
            sumaCol[j] = suma;
            //System.out.println("Suma Columnas: " + j + ":" + suma);
        }

        sumaDia[0] = sumaDP;
        sumaDia[1] = sumaDS;

        boolean condicionFila, condicionColumna, condicionDiagonal;

        condicionFila = comprobacion(sumaFi, 3);
        condicionColumna = comprobacion(sumaCol, 3);
        condicionDiagonal = comprobacion(sumaDia, 2);

        if (condicionFila == condicionDiagonal && condicionFila == condicionColumna && condicionColumna == condicionDiagonal) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }

    }

    public static void llenarMatriz(int[][] matriz, int n) {

        Scanner entrada = new Scanner(System.in);
        int num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un número para la posición " + i + "," + j);
                num = entrada.nextInt();

                while (num < 1 || num > 9) {
                    System.out.println("Ingrese número nuevamente: ");
                    num = entrada.nextInt();
                }

                matriz[i][j] = num;
            }
        }

    }

    public static void escribirMatriz(int[][] matriz, int n) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static boolean comprobacion(int[] vector, int n) {
        boolean condicion = false;
        int aux = vector[0];
        for (int i = 1; i < n; i++) {
            if (aux == vector[i]) {
                condicion = true;
                aux = vector[i - 1];
            } else {
                condicion = false;
                i = n;
            }
        }

        return condicion;
    }

}

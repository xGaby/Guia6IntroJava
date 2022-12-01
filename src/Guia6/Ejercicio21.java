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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizM = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 65, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] matrizP = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int[][] matrizV = new int[3][3];

        System.out.println("La matriz M es: ");
        escribirMatriz(matrizM, 10);
        System.out.println("La matriz P es: ");
        escribirMatriz(matrizP, 3);

        int posicionI;
        int posicionJ;

//        for (int i = 0; i < (10); i++) {
//            for (int j = 0; j < (10 - 3); j++) {
//                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]) {
//                    posicionI = i;
//                    posicionJ = j;
//                    System.out.println("posicion i: " + posicionI + " posicion j: " + posicionJ);
//                }
//            }
//        }

        int n = 0;
        int m = 0;
        boolean bandera = false;

        do {
            for (int i = m; i < (m + 3); i++) {
                for (int j = n; j < (n + 3); j++) {
                    matrizV[i - m][j - n] = matrizM[i][j];
                }
            }

            n = ++n;

            if (n == 8) {
                n = 0;
                m = ++m;
            }

            //escribirMatriz(matrizV, 3);
            //System.out.println("***");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrizV[i][j] == matrizP[i][j]) {
                        bandera = true;
                    } else {
                        bandera = false;
                        i = 3;
                        j = 3;
                    }
                }
            }

            //System.out.println(m + "," + n);
            if (bandera == true) {
                posicionI = m;
                posicionJ = (n - 1);
                m = 10;
                System.out.println("La posicion inicial de la matriz es en: " + posicionI + "," + posicionJ);
            }

        } while (m < 8);

    }

    public static void escribirMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}

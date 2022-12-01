/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia6;

/**
 *
 * @author Gabriela
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizA = {{0, 4, 7}, {-4, 0, -3}, {-7, 3, 0}};
        //int[][] matrizA = {{2,4,4},{6,6,9},{8,10,12}};
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");

        }

        System.out.println("La matriz traspuesta es: ");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizB[i][j] = (-1) * matrizA[j][i];
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }

        boolean bandera = false;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == matrizB[i][j]) {
                    bandera = true;
                } else {
                    bandera = false;
                    i = matrizA.length;
                    j = matrizA.length;
                }

            }

        }

        if (bandera == true) {
            System.out.println("La matriz es antisimetrica");
        } else if (bandera == false) {
            System.out.println("La matriz no es antisimetrica");
        }

    }

}

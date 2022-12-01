/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package Guia6;


/**
 *
 * @author Gabriela
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int cuadrado = 5;

        for (int i = 0; i < cuadrado; i++) {

            for (int j = 0; j < cuadrado; j++) {

                if (i == 0 || j == 0 || i == (cuadrado - 1) || j == (cuadrado - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

    }

}

/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese tamaño del vector: ");

        int n = entrada.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            //Math.random() * (MAX - MIN + 1)) + MIN; 
            vector[i] = (int) (Math.random() * 201);//numeros entre 0 y 10
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");

        int contador = 1;
        int num1D = 0;
        int num2D = 0;
        int num3D = 0;
        int num4D = 0;
        int num5D = 0;

        for (int i = 0; i < vector.length; i++) {
            contador = 1;
            while (vector[i] > 0) {
                vector[i] = vector[i] / 10;
                //System.out.println("el vector es: " + vector[i]);
                if (vector[i] == 0) {
                    contador = contador - 1;
                }
                contador = contador + 1;
            }
            switch (contador) {
                case 1:
                    num1D = num1D + 1;
                    break;
                case 2:
                    num2D = num2D + 1;
                    break;
                case 3:
                    num3D = num3D + 1;
                    break;
                case 4:
                    num4D = num4D + 1;
                    break;
                case 5:
                    num5D = num5D + 1;
                    break;
                default:
                    break;
            }
            //System.out.println(contador);

        }

        System.out.println("Existen " + num1D + " de 1 cifra");
        System.out.println("Existen " + num2D + " de 2 cifras");
        System.out.println("Existen " + num3D + " de 3 cifras");
        System.out.println("Existen " + num4D + " de 4 cifras");
        System.out.println("Existen " + num5D + " de 5 cifras");

    }

}

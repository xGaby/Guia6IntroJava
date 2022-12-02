/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver	true	si es
primo, sino	false. 
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();

        boolean bandera;
        bandera = numeroPrimo(num);

        if (bandera == true) {
            System.out.println("El número ES primo");
        } else {
            System.out.println("El número NO es primo");
        }

    }

    public static boolean numeroPrimo(int num) {

        boolean bandera = false;
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                contador = ++contador;
                //System.out.println(contador + "," + i);
            }
        }

        if (contador == 2) {
            bandera = true;
        }

        //System.out.println(contador);
        return bandera;
    }

}

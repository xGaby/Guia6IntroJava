/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias. 
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de familias: ");

        int familias = entrada.nextInt();
        int hijos;
        int suma = 0;
        double media;

        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese el número de hijos de la familia " + i + " :");
            hijos = entrada.nextInt();
            suma += hijos;
        }

        media = suma / familias;

        System.out.println("La media de edad de los hijos de todas las familias es: " + media);

    }

}

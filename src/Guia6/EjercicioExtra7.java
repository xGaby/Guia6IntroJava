/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a ingresar: ");

        int numeros = entrada.nextInt();

        System.out.println("Ingrese un número mayor a 0: ");
        int num = entrada.nextInt();

        int min = num;
        int max = num;
        float promedio;
        float suma = 0;
        int contador = 1;

        while (num > 0 && contador < numeros) {

            suma = suma + num;

            System.out.println("Ingrese un número: ");
            num = entrada.nextInt();
            contador = ++contador;
            System.out.println(contador + "." + numeros);

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

        }

        promedio = suma / numeros;

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("El promedio es: " + promedio);

    }

}

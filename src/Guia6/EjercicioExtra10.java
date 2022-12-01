/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11);//numeros entre 0 y 10
        int num2 = (int) (Math.random() * 11);//numeros entre 0 y 10

        int mult = num1 * num2;

        System.out.println("Adivine el resultado de la multiplicación: ");
        int numA = entrada.nextInt();

        //System.out.println(num1 + ","+ num2);
        while (numA != mult) {
            System.out.println("Incorrecto. Intente nuevamente: ");
            numA = entrada.nextInt();
        }

        if (numA == mult) {
            System.out.println("Ha averiguado correctamente el número.");
        }

    }

}

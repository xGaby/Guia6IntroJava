/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String codigo = "&&&&&";
        String frase;
        int longitud;
        int contadorV = 0;
        int contadorF = 0;

        do {
            System.out.println("Ingrese una frase: ");
            frase = entrada.nextLine();

            longitud = frase.length();

            if (longitud == 5 && frase.substring(0, 1).equals("X") && frase.substring(longitud - 1).equals("O")) {
                contadorV = ++contadorV;
            } else {
                contadorF = ++contadorF;
            }

        } while (!frase.equals(codigo));

        System.out.println("La cantidad de veces correctas es: " + contadorV);
        System.out.println("La cantidad de veces incorrectas es: " + contadorF);
    }

}

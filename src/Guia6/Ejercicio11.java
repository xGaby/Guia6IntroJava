/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a 
mostrar el menú.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese número 1: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese número 2: ");
        int num2 = entrada.nextInt();

        int opcion;

        boolean bandera;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion: ");

            opcion = entrada.nextInt();
            bandera = false;

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = num2 - num1;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("La multiplicación es: " + mult);
                    break;
                case 4:
                    float div = num2 / num1;
                    System.out.println("La divisón es: " + div);
                    break;
                case 5:
                    System.out.println("Está seguro de continuar (S/N)?: ");
                    String mensaje = entrada.next();

                    mensaje = mensaje.toUpperCase();

                    if (mensaje.equals("S")) {
                        bandera = true;
                    }
                    break;
            }

        } while (bandera == false);

    }

}

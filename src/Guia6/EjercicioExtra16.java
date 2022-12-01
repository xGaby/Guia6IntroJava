/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”. 
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de personas: ");
        int personas = entrada.nextInt();

        String nombre = "";
        int edad = 0;

        int i = 0;
        String opcion = "SI";
        while (i < personas && opcion.equals("SI")) {
            informacion(nombre, edad);

            i = ++i;

            System.out.println("Desea seguir ingresando personas: ");
            opcion = entrada.next();
            opcion = opcion.toUpperCase();
        }

    }

    public static void informacion(String nombre, int edad) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.println("Su nombre es: " + nombre + " su edad es: " + edad);

        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad.");
        }
    }

}

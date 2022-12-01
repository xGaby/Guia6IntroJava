/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a ingresar: ");

        int numeros = entrada.nextInt();

        
        int num;
        int max = 0;
        int min = 0;
        float promedio;
        float suma = 0;
        int contador = 0;

        do {
            System.out.println("Ingrese un número (mayor a 0): ");
            num = entrada.nextInt(); 
            
            if (num > max) {
                max = num;
            }

            if ((num < min) || (min == 0)) {
                min = num;
            }
            
            suma = suma + num;
            
            contador = ++contador;
                
        } while (num > 0 && contador < numeros);

        promedio = suma / numeros;

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
    
}

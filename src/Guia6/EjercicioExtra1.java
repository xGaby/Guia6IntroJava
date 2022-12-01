/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. 
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos (min): ");
        int minutos = entrada.nextInt();
        
        int dias = 0;
        int horas;
        
        horas = minutos / 60;
        
        do {
            dias = ++dias;
            horas = horas - 24;
        } while (horas >= 24);
        
        
        
        System.out.println(minutos + " minutos son: " + dias + " dias " + horas + " horas");
    }
    
}

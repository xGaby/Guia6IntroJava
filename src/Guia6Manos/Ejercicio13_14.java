/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package Guia6Manos;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Ejercicio13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de compañeros: ");
        
        int companeros = entrada.nextInt();
                
        String[] equipo = new String[companeros];
        
        for(int i = 0; i < companeros; i++){
            System.out.println("Ingrese un nombre: ");
            equipo[i] = entrada.next();
        }
        
    }
    
}

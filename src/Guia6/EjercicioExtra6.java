/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Guia6;

//import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //entrada.useLocale(Locale.US);
        //cambio de separación decimal de , a .
        
        System.out.println("Ingrese el número de personas: ");
        
        int personas = entrada.nextInt();
        
        double promedio;
        double promedioT;
        double suma = 0;
        double sumaT = 0;
        int cont = 0;
        
        double altura;
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + i + " :");
            altura = entrada.nextDouble();
            
            if (altura <= 1.60) {
                suma = suma + altura;
                System.out.println(suma);
                cont = cont + 1;
            }
            
            sumaT = sumaT + altura;
            
        }
        
        promedio = (suma/cont);
        promedioT = (sumaT/personas);
        
        System.out.println("El promedio de estaturas menores de 1.60 es: " + promedio);
        System.out.println("El promedio total es: " + promedioT);
        
        
    }
    
}

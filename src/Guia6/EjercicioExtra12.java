/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Gabriela
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] contador = {0, 0, 0};
        int aux = contador.length - 1;

//        for (int k = (contador.length - 1); k >= 0; k--) {
//            for (int i = 0; i < 10; i++) {
//
//                for (int j = 0; j < 3; j++) {
//                    System.out.print(contador[j]);
//                }
//                System.out.println("");
//            }
//        }
        int num = 999;
        String cadena;

        for (int i = 0; i <= num; i++) {
            //System.out.println(i);
            cadena = Integer.toString(i);
            
            cadena = cadena.replace("3", "E");
            System.out.println(cadena);
           
            
            
        }

        
    }

}

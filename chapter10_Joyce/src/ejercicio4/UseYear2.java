/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class UseYear2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Year anio = new Year();
        LeapYear anio_2 = new LeapYear();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un mes y un dia: ");
        System.out.println("Anio 1, dias completados: " + anio.diasCompletados(sc.nextInt(), sc.nextInt()));
        
        System.out.print("\nDigite un mes y un dia: ");
        System.out.println("Anio 2, dias completados: " + anio_2.diasCompletados(sc.nextInt(), sc.nextInt()));
        
    }
    
}

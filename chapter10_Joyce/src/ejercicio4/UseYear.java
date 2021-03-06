/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class UseYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Year anio = new Year();
        LeapYear anio_2 = new LeapYear();
        
        System.out.println("Dias: " + anio.getDias_total());
        System.out.println("Dias: " + anio_2.getDias_total());
    }
    
}

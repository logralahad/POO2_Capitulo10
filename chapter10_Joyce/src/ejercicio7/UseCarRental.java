/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author logra
 */
public class UseCarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarRental chevy = new CarRental("Juan", 68010, "fullsize", 14);
        LuxuryCarRental limusina = new LuxuryCarRental("Pepe", 68010, "fullsize", 10, true);
        
        System.out.println(chevy.display());
        System.out.println(limusina.display());
        
        
    }
    
}

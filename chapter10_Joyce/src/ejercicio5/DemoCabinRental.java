/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class DemoCabinRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CabinRental cabania_1 = new CabinRental(95);
        HolidayCabinRental cabania_2 = new HolidayCabinRental(2);
        
        System.out.println("Precio cabania1: $" + cabania_1.getPrecio_renta());
        System.out.println("Precio cabania2: $" + cabania_2.getPrecio_renta());
        
    }
    
}

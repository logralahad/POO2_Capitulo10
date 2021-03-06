/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author logra
 */
public class UseVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle toyota = new Vehicle(6, 65);
        Car chevy = new Car(480);
        MotorCycle italika = new MotorCycle(120);
        
        System.out.println("Toyota\n" + toyota.toString());
        System.out.println("Chevy\n" + chevy.toString());
        System.out.println("Italika\n" + italika.toString());
    }
    
}

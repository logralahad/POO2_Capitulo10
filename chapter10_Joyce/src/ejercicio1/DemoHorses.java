/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author logra
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Horse speedy = new Horse("Speedy", "negro", 2001);
        RaceHorse tiro = new RaceHorse("Tiro al blanco", "negro", 2001, 65);
        
        System.out.println(speedy.toString());
        System.out.println(tiro.toString());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class DemoTennisGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TennisGame juego1 = new TennisGame();
        DoubleTennisGame juego2 = new DoubleTennisGame();
        
        juego1.setNombre_p1("juan");
        juego1.setNombre_p2("pepe");
        juego1.setScores(15, 4);
        System.out.println(juego1.toString());
        
        juego2.setNombre_p1("pepe", "kiko");
        juego2.setNombre_p2("juan", "steve");
        juego2.setScores(3, 2);
        System.out.println(juego2.toString());
    }
    
}

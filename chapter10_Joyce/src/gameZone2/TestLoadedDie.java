/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author logra
 */
public class TestLoadedDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DieGame juego = new DieGame();
        
        juego.dieVsDie();
        System.out.println(juego.resultadosDieVsDie());
        
        juego.dieVsLoadedDie();
        System.out.println(juego.resultadosDieVsLoadedDie());
    }
    
}

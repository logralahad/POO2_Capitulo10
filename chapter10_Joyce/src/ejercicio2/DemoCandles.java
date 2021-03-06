/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author logra
 */
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Candle velita = new Candle("Rosa", 15);
        ScentedCandle vela = new ScentedCandle("Negra", 15, "Cereza");
        
        System.out.println(velita.toString());
        System.out.println(vela.toString());
    }
    
}

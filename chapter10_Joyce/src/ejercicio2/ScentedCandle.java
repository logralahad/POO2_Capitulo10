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
public class ScentedCandle extends Candle {
    
    public static final Integer COSTXINCH = 3;
    private String scent;

    public ScentedCandle(String color, Integer height, String scent) {
        super(color, height);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public Integer calcularPrecio(){
        return this.getHeight() * COSTXINCH;
    }

      
    @Override
    public String toString(){
        return String.format("Color: %s\nAltura: %d\nPrecio: $%d\nAroma: %s", 
                this.getColor(), this.getHeight(), this.getPrecio(), scent);
    }
}

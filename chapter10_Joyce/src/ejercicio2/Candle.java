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
public class Candle {
    
    public static final Integer COSTXINCH = 2;
    
    private String color;
    private Integer height;
    private Integer precio;

    public Candle(String color, Integer height) {
        this.color = color;
        setHeight(height);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
        this.precio = calcularPrecio();
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public Integer calcularPrecio(){
        return this.height * COSTXINCH;
    }
    
    public String toString(){
        return String.format("Color: %s\nAltura: %d\nPrecio: $%d\n", color, height, precio);
    }
    
}

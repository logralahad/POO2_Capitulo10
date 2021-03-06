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
public class Vehicle {
    
    private Integer llantas;
    private Integer millas_por_galon;

    public Vehicle(Integer llantas, Integer litros_por_galon) {
        this.llantas = llantas;
        this.millas_por_galon = litros_por_galon;
    }

    public Integer getLlantas() {
        return llantas;
    }

    public Integer getMillas_por_galon() {
        return millas_por_galon;
    }
    
    @Override
    public String toString(){
        return String.format("Num. de llantas: %d\nMillas por galon: %d mi\n", this.llantas, this.millas_por_galon);
    }
    
}

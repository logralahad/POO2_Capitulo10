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
public class DoubleTennisGame extends TennisGame {
    
    private String nombre_partner1;
    private String nombre_partner2;

    public String getNombre_partner1() {
        return nombre_partner1;
    }

    public String getNombre_partner2() {
        return nombre_partner2;
    }
    
    public void setNombre_p1(String nombre_p1, String nombre_partner1) {
        super.setNombre_p1(nombre_p1);
        this.nombre_partner1 = nombre_partner1;
    }

    public void setNombre_p2(String nombre_p2, String nombre_partner2) {
        super.setNombre_p2(nombre_p2);
        this.nombre_partner2 = nombre_partner2;
    }
    
    public String toString(){
        return String.format("J1: %s Score: %d puntos / %s Companiero: %s\nJ2: %s Score: %d puntos / %s Companiero: %s\n", 
                this.getNombre_p1(), this.getScore_p1(), this.getScore1(), this.nombre_partner1,
                this.getNombre_p2(), this.getScore_p2(), this.getScore2(), this.nombre_partner2);
    }
}

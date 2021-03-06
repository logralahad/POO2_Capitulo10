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
public class RaceHorse extends Horse {
    
    private Integer carreras;

    public RaceHorse(String nombre, String color, Integer anio_nacimiento, Integer carreras) {
        super(nombre, color, anio_nacimiento);
        this.carreras = carreras;
    }


    public Integer getCarreras() {
        return carreras;
    }

    public void setCarreras(Integer carreras) {
        this.carreras = carreras;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\nColor: %s\nAnio de nacimiento: %d\nCarreras completadas: %d\n", 
                this.getNombre(), this.getColor(), this.getAnio_nacimiento(), this.carreras);
    }
    
    
}

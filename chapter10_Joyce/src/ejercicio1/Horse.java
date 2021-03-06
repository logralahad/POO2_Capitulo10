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
public class Horse {
    
    private String nombre;
    private String color;
    private Integer anio_nacimiento;

    public Horse(String nombre, String color, Integer anio_nacimiento) {
        this.nombre = nombre;
        this.color = color;
        this.anio_nacimiento = anio_nacimiento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(Integer anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\nColor: %s\nAnio de nacimiento: %d\n", nombre, color, anio_nacimiento);
    }
    
}

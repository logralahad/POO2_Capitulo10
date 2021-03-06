/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author logra
 */
public class LabCourse extends CollegeCourse{
    
    public static final Integer IMPUESTO = 50;
    
    public LabCourse(String departamento, Integer num_curso, Integer creditos) {
        super(departamento, num_curso, creditos);
    }
    
    @Override
    public Integer calcularCosto(){
        return (this.getCreditos() * TARIFA) + IMPUESTO;
    }
    
    @Override
    public String display(){
        return String.format("LAB Curso %s %d\nCreditos: %d\nCosto total: $%d", this.getDepartamento(),
                this.getNum_curso(), this.getCreditos(), this.getCosto());
    }
    
}

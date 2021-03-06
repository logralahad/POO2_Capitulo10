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
public class CollegeCourse {
    
    public static final Integer TARIFA = 120;
    
    private String departamento;
    private Integer num_curso;
    private Integer creditos;
    private Integer costo;

    public CollegeCourse(String departamento, Integer num_curso, Integer creditos) {
        this.departamento = departamento;
        this.num_curso = num_curso;
        this.creditos = creditos;
        this.costo = calcularCosto();
    }

    public String getDepartamento() {
        return departamento;
    }

    public Integer getNum_curso() {
        return num_curso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public Integer getCosto() {
        return costo;
    }
    
    public Integer calcularCosto(){
        return this.creditos * TARIFA;
    }
    
    public String display(){
        return String.format("Curso %s %d\nCreditos: %d\nCosto total: $%d", this.departamento,
                this.num_curso, this.creditos, this.costo);
    }
}

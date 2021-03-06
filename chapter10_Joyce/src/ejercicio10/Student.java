/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author logra
 */
public class Student extends Person{
    
    private String grado;
    private Double gpa;

    public Student() {
        super();
        this.grado = JOptionPane.showInputDialog(null, "Grado de estudio");
        this.gpa = Double.parseDouble(JOptionPane.showInputDialog(null, "GPA del alumno"));
    }
    
    @Override
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, String.format("Nombre completo: %s %s\n"
                + "Direccion: %s\nCodigo Postal: %s\nTelefono %s\nGrado: %s\nGPA: %.2f", this.getNombre(), 
                this.getApellido(), this.getDireccion(), this.getCodigo_postal(), this.getNumero(), grado, gpa),
                "Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}

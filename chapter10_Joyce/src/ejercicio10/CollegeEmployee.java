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
public class CollegeEmployee extends Person{
    
    private Integer num_seg_social;
    private Integer salario_anual;
    private String departamento;

    public CollegeEmployee() {
        super();
        this.num_seg_social = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba su numero de seguridad social"));
        this.salario_anual = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto gana anualmente?"));
        this.departamento = JOptionPane.showInputDialog(null, "Escriba a que departamento pertence");
    }
    
    @Override
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, String.format("Nombre completo: %s %s\n"
                + "Direccion: %s\nCodigo Postal: %s\nTelefono %s\nNum. de seguridad social: %d\n"
                + "Salario anual: $%d\nDepartamento: %s\n", this.getNombre(), this.getApellido(), 
                this.getDireccion(), this.getCodigo_postal(), this.getNumero(), num_seg_social, 
                salario_anual, departamento), "Empleado", JOptionPane.INFORMATION_MESSAGE);
    }

    public Integer getNum_seg_social() {
        return num_seg_social;
    }

    public Integer getSalario_anual() {
        return salario_anual;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    
    
    
}

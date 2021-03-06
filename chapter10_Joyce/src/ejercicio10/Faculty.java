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
public class Faculty extends CollegeEmployee{
    
    private Boolean titular;

    public Faculty() {
        super();
        if(JOptionPane.showInputDialog(null, "Es titular? si | no").equals("si")){
            this.titular = true;
        }
        else{
            this.titular = false;
        }
    }
    
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, String.format("Nombre completo: %s %s\n"
                + "Direccion: %s\nCodigo Postal: %s\nTelefono %s\nNum. de seguridad social: %d\n"
                + "Salario anual: $%d\nDepartamento: %s\nTitular: %b", this.getNombre(), this.getApellido(), 
                this.getDireccion(), this.getCodigo_postal(), this.getNumero(), this.getNum_seg_social(), 
                this.getSalario_anual(), this.getDepartamento(), titular),"Titular de Facultad", JOptionPane.INFORMATION_MESSAGE);
    }

    public Boolean getTitular() {
        return titular;
    }
    
    
    
    
}

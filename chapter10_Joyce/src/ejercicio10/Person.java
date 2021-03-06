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
public class Person {
    
    //first name, last name, street address, zip code, and
    //phone number
    
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer codigo_postal;
    private String numero;

    public Person() {
        setInfo();
    }

    public void setInfo() {
        this.nombre = JOptionPane.showInputDialog(null, "Escriba su nombre");
        this.apellido = JOptionPane.showInputDialog(null, "Escriba su apellido");
        this.direccion = JOptionPane.showInputDialog(null, "Escriba su direccion");
        this.codigo_postal = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba su codigo postal"));
        this.numero = JOptionPane.showInputDialog(null, "Escriba su telefono");
    }
    
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, String.format("Nombre completo: %s %s\n"
                + "Direccion: %s\nCodigo Postal: %s\nTelefono %s", nombre, apellido,
                direccion, codigo_postal, numero), "Persona", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public String getNumero() {
        return numero;
    }
    
    
    
}

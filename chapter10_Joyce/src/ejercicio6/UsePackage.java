/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public class UsePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Package amazon = new Package(1, 'A');
        InsuredPackage mercado_libre = new InsuredPackage(8, 'A');
        
        Package amazon2 = new Package(9, 'T');
        InsuredPackage mercado_libre2 = new InsuredPackage(16, 'T');
        
        Package amazon3 = new Package(17, 'M');
        InsuredPackage mercado_libre3 = new InsuredPackage(26, 'M');
        
        System.out.println("Paquete 1\n" + amazon.display());
        System.out.println("Paquete 2\n" + mercado_libre.display());
        System.out.println("Paquete 3\n" + amazon2.display());
        System.out.println("Paquete 4\n" + mercado_libre2.display());
        System.out.println("Paquete 5\n" + amazon3.display());
        System.out.println("Paquete 6\n" + mercado_libre3.display());
    }
    
}

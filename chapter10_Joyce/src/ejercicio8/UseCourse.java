/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author logra
 */
public class UseCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        String[] cursos = {"BIO", "CHM", "CIS", "PHY", "MATH", "ENG", "PE"};
        
        int opc = rd.nextInt(cursos.length);
        if(opc > 3){
            CollegeCourse cursito = new CollegeCourse(cursos[opc], 101, 6);
            System.out.println(cursito.display());
        }
        else{
            LabCourse cursote = new LabCourse(cursos[opc], 101, 6);
            System.out.println(cursote.display());
        }
        
    }
    
}

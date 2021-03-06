/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author logra
 */
public class LessonWithRental extends Rental{
    
    public final static String[] INSTRUCTORES = {"Elisa", "Marcos", "Hugo", "Ana", "Felipe", "Kike", "Maria", "Isabel"};
    
    private Boolean leccion;

    public LessonWithRental(String contrato, Integer minutos, String telefono, Integer equipamiento) {
        super(contrato, minutos, telefono, equipamiento);
        setLeccion();
    }
    
    private void setLeccion(){
        if(this.getEquipo().equals("jet ski") || this.getEquipo().equals("barco ponton")){
            this.leccion = true;
        }
        else{
            this.leccion = false;
        }
    }
    
    public String getInstructor(){
        return String.format("\nLeccion obligatoria: %b\nInstructor: %s", 
                this.leccion, INSTRUCTORES[this.getEquipamiento()]);
    }
    
    @Override
    public String aPagar(){
        String s1 = super.aPagar();
        String s2 = this.getInstructor();
        return String.format("%s%s", s1, s2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class LeapYear extends Year{

    public static final Integer DIAS = 366;
    
    public LeapYear() {
        super();
    }
    
    @Override
    public Integer setDias_total(){
        return DIAS;
    }
    
    @Override
    public int diasMes(Integer m){
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            
            case 2:
                return 29;
            
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                
            default:
                return -1;
        }
    }
    
    
}

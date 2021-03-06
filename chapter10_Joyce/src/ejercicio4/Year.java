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
public class Year {
    
    public static final Integer DIAS = 365;
    private Integer dias_total;

    public Year() {
        this.dias_total = setDias_total();
    }

    public Integer getDias_total() {
        return dias_total;
    }
    
    public Integer setDias_total(){
        return DIAS;
    }
    
    public Integer diasCompletados(Integer mes, Integer dia){
        Integer dias_totales = 0;
        
        for (int i = 1; i < mes; i++) {
            dias_totales += diasMes(i);
        }
        
        dias_totales += (dia - 1);
        return dias_totales;
    }
    
    
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
                return 28;
            
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

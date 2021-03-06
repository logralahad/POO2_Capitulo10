/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class HolidayCabinRental extends CabinRental{
    
    public static final Double RECARGO = 150.0;

    public HolidayCabinRental(Integer num_cabina) {
        super(num_cabina);
    }
    
    public Double calcularPrecio(){
        switch (this.getNum_cabina()) {
            case 1:
            case 2:
            case 3:
                return PRECIO1 + RECARGO;
                
            default:
                return PRECIO2 + RECARGO;
        }
    }
    
}

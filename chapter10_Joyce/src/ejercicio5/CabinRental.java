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
public class CabinRental {
    
    public static final Double PRECIO1 = 950.0;
    public static final Double PRECIO2 = 1100.0;
    
    private Integer num_cabina;
    private Double precio_renta;

    public CabinRental(Integer num_cabina) {
        this.num_cabina = num_cabina;
        this.precio_renta = calcularPrecio();
    }
    
    public Integer getNum_cabina() {
        return num_cabina;
    }

    public Double getPrecio_renta() {
        return precio_renta;
    }
    
    public Double calcularPrecio(){
        switch (this.num_cabina) {
            case 1:
            case 2:
            case 3:
                return PRECIO1;
                
            default:
                return PRECIO2;
        }
    }
    
    
}

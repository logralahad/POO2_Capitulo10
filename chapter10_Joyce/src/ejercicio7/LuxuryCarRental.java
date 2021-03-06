/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author logra
 */
public class LuxuryCarRental extends CarRental {
    
    private Boolean chofer;
    
    public LuxuryCarRental(String inquilino, Integer codigo_postal, String tamanio, 
            Integer duracion_renta, Boolean chofer) {
        super(inquilino, codigo_postal, tamanio, duracion_renta);
        this.chofer = chofer;
    }
      
    @Override
    public Double getTarifa(String tipo){
        return 79.99;
    }

    public String display(){
        return String.format("Lo renta: %s\nCodigo postal: %s\nTipo de carro: %s\nCosto por dia: $%.2f\n"
                + "Tiempo que se renta: %d dias\nCosto total de la renta: $%.2f\nChofer: %b\n", 
                this.getInquilino(), this.getCodigo_postal(), this.getTamanio(), this.getTarifa_dia(), 
                this.getDuracion_renta(), this.getPrecio_total(), this.chofer);
    }
}

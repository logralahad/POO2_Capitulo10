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
public class CarRental {
    
    private String inquilino;
    private Integer codigo_postal;
    private String tamanio;
    private Double tarifa_dia;
    private Integer duracion_renta;
    private Double precio_total;

    public CarRental(String inquilino, Integer codigo_postal, String tamanio, Integer duracion_renta) {
        this.inquilino = inquilino;
        this.codigo_postal = codigo_postal;
        this.tamanio = tamanio;
        this.duracion_renta = duracion_renta;
        calcularPrecio();
    }

    public String getInquilino() {
        return inquilino;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public String getTamanio() {
        return tamanio;
    }

    public Double getTarifa_dia() {
        return tarifa_dia;
    }

    public Integer getDuracion_renta() {
        return duracion_renta;
    }

    public Double getPrecio_total() {
        return precio_total;
    }
    
    public void calcularPrecio(){
        this.tarifa_dia = getTarifa(this.tamanio);        
        this.precio_total = this.tarifa_dia * this.duracion_renta;
    }
    
    public Double getTarifa(String tipo){
        switch (tipo) {
            case "economy":
                return 29.99;
                
            case "midsize":
                return 38.99;
                
            case "fullsize":
                return 43.50;
            default:
                return 29.99;
        }
    }
    
    public String display(){
        return String.format("Lo renta: %s\nCodigo postal: %s\nTipo de carro: %s\nCosto por dia: $%.2f\n"
                + "Tiempo que se renta: %d dias\nCosto total de la renta: $%.2f\n", inquilino, codigo_postal, 
                tamanio, tarifa_dia, duracion_renta, precio_total);
    }
}

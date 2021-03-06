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
public class Package {
    
    private Integer onzas;
    private Character metodo_envio;
    private Double metodo_costo;

    public Package(Integer onzas, Character metodo_envio) {
        this.onzas = onzas;
        this.metodo_envio = metodo_envio;
        this.metodo_costo = calcularPrecio();
    }

    public Integer getOnzas() {
        return onzas;
    }

    public Character getMetodo_envio() {
        return metodo_envio;
    }

    public Double getMetodo_costo() {
        return metodo_costo;
    }
    
    public Double calcularPrecio(){
        if(this.onzas >= 1 && this.onzas <= 8){
            switch (this.metodo_envio) {
                case 'A':
                    return 2.00;
                    
                case 'T':
                    return 1.50;
                    
                case 'M':
                    return 0.50;
                    
                default:
                    return 2.00;
            }
        }
        else if(this.onzas >= 9 && this.onzas <= 16){
            switch (this.metodo_envio) {
                case 'A':
                    return 3.00;
                    
                case 'T':
                    return 2.35;
                    
                case 'M':
                    return 1.50;
                    
                default:
                    return 3.00;
            }
        }
        else{
            switch (this.metodo_envio) {
                case 'A':
                    return 4.50;
                    
                case 'T':
                    return 3.25;
                    
                case 'M':
                    return 2.15;
                    
                default:
                    return 4.50;
            }
        }
        
    }
    
    public String display(){
        return String.format("Peso: %d oz\nMedio de envio: %c\nCosto de envio: $%.2f\n",
                this.onzas, this.metodo_envio, this.metodo_costo);
    }
    
}

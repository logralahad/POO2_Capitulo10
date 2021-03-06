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
public class InsuredPackage extends Package{
    
    public InsuredPackage(Integer onzas, Character metodo_envio) {
        super(onzas, metodo_envio);
    }
    
    @Override
    public Double calcularPrecio(){
        Double precio;
        Integer peso = this.getOnzas();
        Character metodo = this.getMetodo_envio();
        
        if(peso >= 1 && peso <= 8){
            switch (metodo) {
                case 'A':
                    precio = 2.00;
                    break;
                    
                case 'T':
                    precio = 1.50;
                    break;
                    
                case 'M':
                    precio = 0.50;
                    break;
                    
                default:
                    precio = 2.00;
                    break;
            }
        }
        else if(peso >= 9 && peso <= 16){
            switch (metodo) {
                case 'A':
                    precio = 3.00;
                    break;
                    
                case 'T':
                    precio = 2.35;
                    break;
                    
                case 'M':
                    precio = 1.50;
                    break;
                    
                default:
                    precio = 3.00;
                    break;
            }
        }
        else{
            switch (metodo) {
                case 'A':
                    precio = 4.50;
                    break;
                    
                case 'T':
                    precio = 3.25;
                    break;
                    
                case 'M':
                    precio = 2.15;
                    break;
                    
                default:
                    precio = 4.50;
                    break;
            }
        }
        
        if(precio >= 0.00 && precio <= 1.00){
            precio += 2.45;
        }
        else if(precio >= 1.01 && precio <= 3.00){
            precio += 3.95;
        }
        else{
            precio += 5.55;
        }

        return precio;
    }
    
    @Override
    public String display(){
        return String.format("Peso: %d oz\nMedio de envio: %c\nCosto de envio con tarifa incluida: $%.2f\n",
                this.getOnzas(), this.getMetodo_envio(), this.getMetodo_costo());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author logra
 */
public class LoadedDie extends Die{
    
    public LoadedDie(){
        super();
        if(this.valor == 1){
            this.valor++;
        }
    }
}

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
public class DieGame {
    
    private Die dado1;
    private Die dado2;
    private LoadedDie dado_truqueado;
    private Integer score_d1;
    private Integer score_d2;
    private Integer score_ld;
    private Integer empates;

    public DieGame() {
        this.dado1 = new Die();
        this.dado2 = new Die();
        this.dado_truqueado = new LoadedDie();
        this.score_d1 = 0;
        this.score_d2 = 0;
        this.score_ld = 0;
        this.empates = 0;
    }
    
    public void dieVsDie(){
        this.score_d1 = 0;
        this.score_d2 = 0;
        this.empates = 0;
        
        for (int i = 0; i < 1001; i++) {
            this.dado1.lanzar();
            this.dado2.lanzar();
            
            if(this.dado1.getValor() > this.dado2.getValor()){
                this.score_d1++;
            }
            else if(this.dado1.getValor() < this.dado2.getValor()){
                this.score_d2++;
            }
            else{
                this.empates++;
            }
        }
    }
    
    public void dieVsLoadedDie(){
        this.score_d1 = 0;
        this.score_ld = 0;
        this.empates = 0;
        
        for (int i = 0; i < 1001; i++) {
            this.dado1.lanzar();
            this.dado_truqueado.lanzar();
            
            if(this.dado1.getValor() > this.dado_truqueado.getValor()){
                this.score_d1++;
            }
            else if(this.dado1.getValor() < this.dado_truqueado.getValor()){
                this.score_ld++;
            }
            else{
                this.empates++;
            }
        }
    }
    

    public String resultadosDieVsDie(){
        return String.format("Dado1 gano: %d\nDado2 gano: %d\nEmpates: %d\n", this.score_d1, 
                this.score_d2, this.empates);
    }
    public String resultadosDieVsLoadedDie(){
        return String.format("Dado1 gano: %d\nLoadedDie gano: %d\nEmpates: %d\n", this.score_d1, 
                this.score_ld, this.empates);
    }
    
}

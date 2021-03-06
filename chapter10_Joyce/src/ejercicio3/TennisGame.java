/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class TennisGame {
    
    private String nombre_p1;
    private String nombre_p2;
    private Integer score_p1;
    private Integer score_p2;
    private String score1;
    private String score2;

    public String getNombre_p1() {
        return nombre_p1;
    }

    public String getNombre_p2() {
        return nombre_p2;
    }

    public Integer getScore_p1() {
        return score_p1;
    }

    public Integer getScore_p2() {
        return score_p2;
    }

    public String getScore1() {
        return score1;
    }

    public String getScore2() {
        return score2;
    }

    public void setNombre_p1(String nombre_p1) {
        this.nombre_p1 = nombre_p1;
    }

    public void setNombre_p2(String nombre_p2) {
        this.nombre_p2 = nombre_p2;
    }
    
    public void setScores(Integer s1, Integer s2){
        if( (s1 < 0 || s1 > 4) || (s2 < 0 || s2 > 4) || (s1 == 4 && s2 == 4)){
            this.score_p1 = 0;
            this.score_p2 = 0;
            this.score1 = "error";
            this.score2 = "error";
        }
        else{
            this.score_p1 = s1;
            this.score_p2 = s2;
            this.score1 = setStringScore(s1);
            this.score2 = setStringScore(s2);
            
        }
        
    }
    
    private String setStringScore(Integer score){
        switch (score) {
            case 0:
                return "love";
                
            case 1:
                return "15";
                
            case 2:
                return "30";
                
            case 3:
                return "40";
                
            case 4:
                return "game";
                
            default:
                return "love";
        }
    }
    
    @Override
    public String toString(){
        return String.format("J1: %s Score: %d puntos / %s\nJ2: %s Score: %d puntos / %s\n", 
                nombre_p1, score_p1, score1, nombre_p2, score_p2, score2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

/**
 *
 * @author logra
 */
public class DinnerEvent extends Event{
    
    public final static String[] ENTRADAS = {"papas bravas", "croquetas", "canapes", "sopa de verduras"};
    public final static String[] PLATILLOS = {"costillar a la parrilla", "lasagna", "pastel de carne", "lentejas"};
    public final static String[] POSTRES = {"pay de limon", "flan napolitano", "brocheta de frutas", "panque"};
    
    private Integer entrada;
    private Integer plato1;
    private Integer plato2;
    private Integer postre;
        
    public DinnerEvent(Integer entrada, Integer plato1, Integer plato2, Integer postre, 
            String evento, Integer num_inv, String telefono, Integer modo_evento) {
        super(evento, num_inv, telefono, modo_evento);
        this.entrada = entrada;
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.postre = postre;
    }
    
    public static String getMenu(){
        String entradas = String.format("Entradas: [0]%s [1]%s [2]%s [3]%s\n", 
                ENTRADAS[0], ENTRADAS[1], ENTRADAS[2], ENTRADAS[3]);
        String platillos = String.format("Platillos: [0]%s [1]%s [2]%s [3]%s\n", 
                PLATILLOS[0], PLATILLOS[1], PLATILLOS[2], PLATILLOS[3]);
        String postres = String.format("Postres: [0]%s [1]%s [2]%s [3]%s\n", 
                POSTRES[0], POSTRES[1], POSTRES[2], POSTRES[3]);
        return String.format("\n%s%s%s", entradas, platillos, postres);
    }
    
    @Override
    public String eCosto(){
        String s1 = super.eCosto();
        String s2 = String.format("\nEntrada: %s\nPlatillo 1: %s\nPlatillo 2: %s\nPostre: %s", ENTRADAS[this.entrada], 
                PLATILLOS[this.plato1], PLATILLOS[this.plato2], POSTRES[this.postre]);
        
        return String.format("%s%s", s1, s2);
    }
    
    
}

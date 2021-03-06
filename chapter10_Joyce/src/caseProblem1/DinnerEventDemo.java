/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class DinnerEventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<DinnerEvent> eventos = new ArrayList<>();
        int inv = 0, modo= 0, entrada = 0;
        int plato1 = 0, plato2 = 0, postre = 0;
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre del evento " + (i + 1) + ": ");
            String name = sc.nextLine();

            do {
                System.out.print("Numero de invitados [5-100]: ");
                inv = sc.nextInt();
                
            } while (inv < 5 || inv > 100);
            sc.nextLine();
            
            System.out.print("Telefono: ");
            String tel = sc.nextLine();
            
            System.out.print("Modo de evento: [0]boda [1]bautizo"
                    + " [2]cumpleanios [3]empresarial [4]otro: ");
            modo = sc.nextInt();
            
            System.out.println(DinnerEvent.getMenu());
            
            System.out.print("Entrada #: ");
            entrada = sc.nextInt();
            
            System.out.print("Platillo 1 #: ");
            plato1 = sc.nextInt();
            
            System.out.print("Platillo 2 #: ");
            plato2 = sc.nextInt();
            
            System.out.print("Postre #: ");
            postre = sc.nextInt();
            
            sc.nextLine();
            System.out.println("");

            eventos.add(new DinnerEvent(entrada, plato1, plato2, postre,
                    name, inv, tel, modo));
        }
        
        Event.ordenar(eventos);
        
        for (DinnerEvent s : eventos) {
            System.out.println(s.eCosto());
            Event.CarlysMotto();
        }
    }
    
}

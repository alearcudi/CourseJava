/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;

/**
 *
 * @author ITMaster
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tablero t = new Tablero();
        
        t.set(0, 0, Ficha.CRUZ);
        t.set(1, 1, Ficha.CRUZ);
        t.set(2, 2, Ficha.CRUZ);
        
        t.mostrar();
    }
    
}

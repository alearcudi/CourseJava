
package tateti;

import modelo.Tablero;
import modelo.Ficha;


public class Main {

   
    public static void main(String[] args) {
 
        
        Tablero t = new Tablero();
        
        t.set(0, 0, Ficha.CRUZ);
        t.set(1, 1, Ficha.CRUZ);
        t.set(2, 2, Ficha.CRUZ);
        
        t.mostrar();
    }
    
}

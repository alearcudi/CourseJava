package juegosdecartas;

import cartas.Carta;
import cartas.CartaPoker;
import juegos.BlackJack;
import juegos.Guerra;
import jugadores.JugadorComputadora;
import jugadores.JugadorHumano;
import mazos.Mazo;
import mazos.MazoBlackJack;
import mazos.MazoPoker;

public class Main {

   
    public static void main(String[] args) {
//       Carta c = new CartaPoker(12, 4);
//        System.out.println(c);
        
//        Mazo m= new MazoBlackJack();
//        System.out.println("\nmazo: " + m.toString());
//        
//        m.llenar();
//        System.out.println("\nmazo: " + m.toString());
//        
//        m.mezclar();
//        System.out.println("\nmazo: " + m.toString());

//            BlackJack juego = new BlackJack();
//            
//            juego.agregarJugador(new JugadorComputadora("Compu Uno",100));
//            juego.agregarJugador(new JugadorHumano("Juan de los Palotes",100));
//            juego.agregarJugador(new JugadorComputadora("Compu Dos",200));
//            juego.agregarJugador(new JugadorComputadora("Compu Tres",159));
//            
//            juego.jugar();

        new Guerra("Juan", "Pinchame").jugar();
    }
    
}

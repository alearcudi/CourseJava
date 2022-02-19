package Main;

import juegos.BlackJack;
import juegos.SieteYmedio;
import jugadores.JugadorComputadora;
import jugadores.JugadorHumano;

public class Main {

   
    public static void main(String[] args) {

//
//            BlackJack juego = new BlackJack();
              SieteYmedio juego = new SieteYmedio();
//            
//            juego.agregarJugador(new JugadorComputadora("Compu Uno",100));
              juego.agregarJugador(new JugadorHumano("Juan",100));
//            juego.agregarJugador(new JugadorComputadora("Compu Dos",100));
//            juego.agregarJugador(new JugadorComputadora("Compu Tres",100));
//            
               juego.jugar();
//           
            
        
        

            
  //      new Guerra("Juan", "Pinchame").jugar();
    }
    
}

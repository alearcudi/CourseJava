package controlador;

import java.util.Random;
import modelo.Coordenada;
import modelo.Ficha;
import modelo.Jugador;
import modelo.Tablero;

public class Tateti {

    private static final String LINEA = "--------------------------------------";
    private Jugador jug1;
    private Jugador jug2;
    private Tablero tab;
    private static final Random R = new Random();

    public Tateti(Jugador jug1, Jugador jug2) {

        this.jug1 = jug1;
        this.jug2 = jug2;
        this.tab = new Tablero();
    }

    public void jugar() {

        Coordenada co;
        Jugador actual = R.nextBoolean() ? jug1 : jug2;
        boolean terminar = false;
        tab.mostrar();
        while (tab.existe(Ficha.NADA) && !terminar) {
            System.out.println("Juega :" + actual.getNombre() + "con " + actual.getFicha());
            if (esTateti(actual.getFicha())) {
                terminar = true;
            } else {
                actual = (actual == jug1) ? jug2 : jug1;
            }
        }

    }

    private boolean esTateti(Ficha ficha) {

        for (int fila = tab.getfInicial(); fila <= tab.getfFinal(); fila++) {
            if (tab.filaIgual(fila, ficha)) {
                return true;
            }

        }
        for (int columna = tab.getcInicial(); columna <= tab.getcFinal(); columna++) {
            if (tab.columnaIgual(columna, ficha)) {
                return true;
            }

        }
        return false;

    }

}

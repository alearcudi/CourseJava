package juegos;

import java.util.ArrayList;
import jugadores.Croupier;
import jugadores.JugadorCliente;
import mazos.MazoEspaniol;

public class SieteYmedio {

    private static final String LINEA = "-------------------------------------";

    private MazoEspaniol elMazo;
    private Croupier elCroupier;
    private ArrayList<JugadorCliente> losJugadores;

    private void linea() {
        System.out.println(LINEA);
    }

    public SieteYmedio() {
        elMazo = new MazoEspaniol();
        elMazo.llenar();
        elCroupier = new Croupier("Sr. Croupier");
        losJugadores = new ArrayList();
    }

    public void agregarJugador(JugadorCliente cliente) {
        losJugadores.add(cliente);
    }

    public void jugar() {
        int[] elPozoDeLasApuestas;
        elMazo.mezclar();
        System.out.println(LINEA);
        System.out.println("COMIENZA EL JUEGO.");
        System.out.println(LINEA);
        while (hayJugadoresEnLaMesa()) {
            eliminarLosJugadoresSinFichas();
            elPozoDeLasApuestas = rondaDeApuestas();
            repartirDosCartas();
            int pos = 0;
            for (JugadorCliente jug : losJugadores) {
                double suma = 0;

                System.out.println("JUEGA: " + jug.getNombre());
                System.out.println("MANO: " + jug.getMano().toString());

                while (suma <= 7.5 && !jug.sePlanta()) {

                    jug.tomaCarta(elMazo.get());
                    System.out.println("MANO: " + jug.getMano().toString());
                    suma = jug.laSumaDeLasCartas();
                    System.out.println("SUMA DE LAS CARTAS : " + suma);
 
                }
                while (suma <= 7.5 && !elCroupier.sePlanta()) {

                    elCroupier.tomaCarta(elMazo.get());
                    System.out.println("MANO: " + elCroupier.getMano().toString());
                    suma = elCroupier.laSumaDeLasCartas();
                    System.out.println("SUMA DE LAS CARTAS: " + suma);

                }
                repartirPremios(elPozoDeLasApuestas);
                limpiarCartas();

            }

        }

    }

    private boolean hayJugadoresEnLaMesa() {
        return !losJugadores.isEmpty();
    }

    private void eliminarLosJugadoresSinFichas() {
        ArrayList<JugadorCliente> aux = new ArrayList();
        for (JugadorCliente jug : losJugadores) {
            if (jug.tieneFichas()) {
                aux.add(jug);
            } else {
                System.out.println("EL JUGADOR: " + jug.getNombre()
                        + "SE RETIRA DE LA MESA");
            }

        }
        losJugadores = aux;
    }

    private int[] rondaDeApuestas() {
        int[] elPozo = new int[losJugadores.size()];
        for (int i = 0; i < elPozo.length; i++) {
            elPozo[i] = 0;
        }
        System.out.println(LINEA);
        System.out.println("RONDA DE APUESTAS.");
        System.out.println(LINEA);
        int posEnLaMesa = 0;
        for (JugadorCliente jug : losJugadores) {
            System.out.println("APUESTA INICIAL: " + jug.getNombre());
            System.out.println("FICHAS TOTALES : " + jug.getFichas());
            elPozo[posEnLaMesa] = jug.hacerApuesta();
            System.out.println("FICHAS APOSTADAS: " + elPozo[posEnLaMesa]);
            posEnLaMesa++;

        }
        return elPozo;

    }

    private void repartirDosCartas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void repartirPremios(int[] elPozoDeLasApuestas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpiarCartas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

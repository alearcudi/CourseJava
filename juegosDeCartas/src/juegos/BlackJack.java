package juegos;

import java.util.ArrayList;
import jugadores.JugadorCliente;
import jugadores.Croupier;
import mazos.MazoBlackJack;

public class BlackJack {

    private static final String LINEA = "--------------------------------------";

    private MazoBlackJack elMazo;
    private Croupier elCroupier;
    private ArrayList<JugadorCliente> losJugadores;

    private void linea() {
        System.out.println(LINEA);
    }

    public BlackJack() {
        elMazo = new MazoBlackJack();
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
                int suma = 0;

                System.out.println("JUEGA: " + jug.getNombre());
                System.out.println("MANO: " + jug.getMano().toString());
                while (suma <= 21 && !jug.sePlanta()) {

                    jug.tomaCarta(elMazo.get());
                    System.out.println("MANO: " + jug.getMano().toString());
                    suma = jug.laSumaDeLasCartas();
                    System.out.println("SUMA DE LAS CARTAS: " + suma);
                }
                //suma = 0;
                while (suma <= 21 && !elCroupier.sePlanta()) {
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

                System.out.println("EL JUGADOR:  "
                        + jug.getNombre() + " SE RETIRA DE LA MESA");

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
        for (JugadorCliente jug : losJugadores) {
            jug.getMano().set(elMazo.get());
            jug.getMano().set(elMazo.get());
        }
        elCroupier.getMano().set(elMazo.get());
        elCroupier.getMano().set(elMazo.get());
        System.out.println(LINEA);
        System.out.println(LINEA);
        System.out.println("MANO CROUPIER: " + elCroupier.getMano().toString());
        System.out.println(LINEA);
        System.out.println(LINEA);

    }

    private int[] crearUnPozoNuevo(int cantidadJugadores) {
        int[] p = new int[cantidadJugadores];
        for (int i = 0; i < cantidadJugadores; i++) {
            p[i] = 0;
        }
        return p;
    }

    private void repartirPremios(int[] elpozo) {
        int sumaJugador = 0;
        int sumaCroupier = elCroupier.laSumaDeLasCartas();
        int posicionJug = 0;

        for (JugadorCliente jug : losJugadores) {
            sumaJugador = jug.laSumaDeLasCartas();
            System.out.println(jug.getNombre());

            if (sumaJugador == 21 && jug.cantidadCartas() == 2) {
                System.out.println("BLACKJACK");
                System.out.println("APOSTO: " + elpozo[posicionJug]);
                System.out.println("GANA: " + elpozo[posicionJug] * 3);
                jug.ganarFichas(elpozo[posicionJug] * 3);
            }
             if (sumaCroupier == 21 && elCroupier.cantidadCartas() == 2) {
                System.out.println("BLACKJACK");
                System.out.println("GANA: " + elCroupier.laSumaDeLasCartas());
                
                }

            if (sumaJugador == sumaCroupier && sumaCroupier <= 21) {
                System.out.println("EMPATE");
                jug.ganarFichas(elpozo[posicionJug]);
            }

            if ((sumaJugador <= 21) && sumaJugador > sumaCroupier && (sumaCroupier <= 21)) {

                // while((sumaJugador<=21)&&(sumaCroupier<=21) ){ 
                System.out.println("GANO");
                System.out.println("APOSTO: " + elpozo[posicionJug]);
                System.out.println("GANA: " + elpozo[posicionJug] * 2);
                jug.ganarFichas(elpozo[posicionJug] * 2);
                //}
            }
            if (sumaJugador <= 21 && sumaCroupier > 21) {
                System.out.println("GANO");
                System.out.println("APOSTO: " + elpozo[posicionJug]);
                System.out.println("GANA: " + elpozo[posicionJug] * 2);
                jug.ganarFichas(elpozo[posicionJug] * 2);
            } else {
                System.out.println("PERDIO");
                System.out.println("APOSTO " + elpozo[posicionJug]);

            }
            posicionJug++;
        } 
    
    }
        

    private void limpiarCartas() {
        System.out.println(LINEA);
        System.out.println("DESCARTANDO!!");
        System.out.println(LINEA);

        for (JugadorCliente jug : losJugadores) {
            while (!jug.getMano().vacio()) {
                elMazo.set(jug.getMano().get());
            }
        }
        while (!elCroupier.getMano().vacio()) {
            elMazo.set(elCroupier.getMano().get());
        }
        elMazo.mezclar();
    }
}

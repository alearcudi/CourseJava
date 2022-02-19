package juegos;

import cartas.CartaPoker;
import jugadores.JugadorGuerra;
import mazos.MazoPoker;

public class Guerra {
    private JugadorGuerra jug1;
    private JugadorGuerra jug2;
    private MazoPoker elMazo;

    public Guerra(String NombJugador1, String NombJugador2) {
        jug1 = new JugadorGuerra(NombJugador1);
        jug2 = new JugadorGuerra(NombJugador2);
        elMazo = new MazoPoker();
        elMazo.llenar();
    }
    
    public void jugar(){
        repartir();
        CartaPoker c1;
        CartaPoker c2;
        
        while(jug1.tieneCartas() && jug2.tieneCartas()){
            c1 =  jug1.getCarta();
            System.out.println(jug1.getNombre()+" "+c1);
            c2 =  jug2.getCarta();
            System.out.println(jug2.getNombre()+" "+c2);
            if (c1.compareTo(c2)>0) {
                jug1.setCarta(c1);
                jug1.setCarta(c2);
                jug1.getMano().mezclar();
                System.out.println("Gana la mano: "+jug1.getNombre());
            }
            else{
                if (c2.compareTo(c1)>0) {
                    jug2.setCarta(c1);
                    jug2.setCarta(c2);
                    jug2.getMano().mezclar();
                    System.out.println("Gana la mano: "+jug2.getNombre());
                }
                else{
                    elMazo.set(c1);
                    elMazo.set(c2);
                    System.out.println("Empate: "+elMazo);
                }
            }
        }
        if (!jug1.tieneCartas()) {
            System.out.println("GANADOR: "+jug2);
        }
        else{
            System.out.println("GANADOR: "+jug1);
        }
        
    }

    private void repartir() {
        elMazo.mezclar();
        while(!elMazo.vacio()){
            jug1.setCarta( elMazo.get());
            jug2.setCarta( elMazo.get());
        }
    }
    
    
    
    
}

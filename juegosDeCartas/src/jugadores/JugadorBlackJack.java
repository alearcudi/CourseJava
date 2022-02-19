package jugadores;

import cartas.Carta;
import mazos.MazoBlackJack;

public abstract class JugadorBlackJack extends JugadorCartas implements Plantable{

    public JugadorBlackJack(String nombre) {
        super(nombre);
        mano = new MazoBlackJack();
    }

public int cantidadCartas(){
    return mano.tamanio();
}    
public void tomaCarta(Carta c){
        mano.set(c);
    }

public int laSumaDeLasCartas(){
        int suma=0;
        int cantidadUnos=0;
        for (int i = 0; i < mano.tamanio(); i++) {
        
            Carta c = mano.ver(i);
            if (c.getNumero()==1) {
                cantidadUnos++;
            }
            else{
                if (c.getNumero()>=10) {
                    suma+=10;
                }
                else{
                    suma+=c.getNumero();
                }
            }
        }
//        TAREA
//        if ((suma+11) <= 21) {
//            suma = suma+11;
//            cantidadUnos--;
//        }
//        else{
//            
//        }


        while( cantidadUnos > 0 && (suma + 11) <= 21  ){
            suma=suma+11;
            cantidadUnos--;
        }
        suma=suma+cantidadUnos;
        return suma;
    }
}
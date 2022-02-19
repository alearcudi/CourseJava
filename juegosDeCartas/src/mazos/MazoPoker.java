package mazos;

import cartas.Carta;
import cartas.CartaPoker;

public final class MazoPoker extends Mazo{

    public MazoPoker() {
        super();
    }
    
    @Override
    public void llenar() {
        for (int numero = 1; numero <= 13; numero++) {
            for (int palo = 1; palo <= 4; palo++) {
                set(new CartaPoker(numero,palo));
            }
        }
    }
    public CartaPoker get(){
        return (CartaPoker)lasCartas.remove(0);
    }
    public CartaPoker get(int posicion){
        return (CartaPoker)lasCartas.remove(posicion);
    }
    public void set(CartaPoker c){
       lasCartas.add(c);
    }
    public void set(int posicion,CartaPoker c){
       lasCartas.add(posicion, c);
    }
}

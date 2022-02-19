package jugadores;

import cartas.CartaPoker;
import mazos.MazoPoker;

public class JugadorGuerra extends JugadorCartas{
    
    
    public JugadorGuerra(String nombre) {
        super(nombre);
        mano = new MazoPoker();
        
    }
    
    public boolean tieneCartas(){
       return  !mano.vacio();
    }
    
    public CartaPoker getCarta(){
        return (CartaPoker) mano.get();
    }

    public void setCarta(CartaPoker c) {
        mano.set(c);
    }
}

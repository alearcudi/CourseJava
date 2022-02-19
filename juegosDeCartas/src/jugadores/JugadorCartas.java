package jugadores;

import mazos.Mazo;

public abstract class JugadorCartas  {
    protected String nombre;
    protected Mazo   mano;

    public JugadorCartas(String nombre) {
        this.nombre = nombre;
        mano = null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + nombre + " Mano: " + mano ;
    }
    
    
    public String getNombre() {
        return nombre;
    }
   

    public Mazo getMano() {
        return mano;
    }
    
}

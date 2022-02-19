package jugadores;

import cartas.Carta;

import mazos.MazoEspaniol;

/**
 *
 * @author ITMaster
 */
public abstract class JugadorCliente extends JugadorSieteYmedio implements Apostable{
    protected int fichas;
    
    
    public JugadorCliente(String nombre,int fichas) {
        super(nombre);
        this.fichas = fichas;
    }

    public int getFichas() {
        return fichas;
    }

    public void ganarFichas(int fichas) {
        this.fichas += fichas;
    }
    public void perderFichas(int fichas) {
        this.fichas -= fichas;
    }
    
    public boolean tieneFichas(){
        return fichas > 0;
    }
    
    
    @Override
    public MazoEspaniol getMano() {
        return (MazoEspaniol) this.mano;
    }
}

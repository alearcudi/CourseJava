package jugadores;

import util.Teclado;

/**
 *
 * @author ITMaster
 */
public final class JugadorHumano extends JugadorCliente{

    public JugadorHumano(String nombre,int fichas) {
        super(nombre,fichas);
    }

    @Override
    public boolean sePlanta() {
        return Character.toUpperCase(Teclado.leerChar("SE PLANTA"
                + " (S/N)? ", "SNsn"))=='S';
        
    }

    @Override
    public int hacerApuesta() {
        int fich=Teclado.leerInt("APUESTA: ", 1,fichas);
        this.perderFichas(fich);
        return fich;
    }
    
    
}

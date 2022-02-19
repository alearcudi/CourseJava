package jugadores;

import java.util.Random;

public final class JugadorComputadora extends JugadorCliente{
    
    private static final int LOCO    = 100;
    private static final int NORMAL  =  50;
    private static final int TIMIDO  =   1;
    private static final Random R = new Random(); 
    
    private int personalidad;

    public JugadorComputadora(String nombre,int fichas) {
        super(nombre,fichas);
        personalidad = R.nextInt(LOCO-TIMIDO+1)+TIMIDO;
    }

    @Override
    public boolean sePlanta() {
        return pensar() >= personalidad;
    }

    @Override
    public int hacerApuesta() {
        int fichasApostadas=0;
        int x = fichas/2;
        if (pensar()>=personalidad) {
            
            fichasApostadas = R.nextInt(fichas-x+1)+x;
        }
        else{
            fichasApostadas = R.nextInt(x-1+1)+1;
        }
        return fichasApostadas;
    }
    
    public int pensar(){
        return R.nextInt(LOCO-TIMIDO+1)+TIMIDO;
    }
    
}

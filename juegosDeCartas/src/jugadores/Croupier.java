package jugadores;

public class Croupier extends JugadorBlackJack{

    public Croupier(String nombre) {
        super(nombre);
    }

    @Override
    public boolean sePlanta() {
       return this.laSumaDeLasCartas()>16;
        
         
    }
    
    
}

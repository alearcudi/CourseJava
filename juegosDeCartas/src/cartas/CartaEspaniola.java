package cartas;

public final class CartaEspaniola extends Carta{

    public CartaEspaniola(int numero, int palo) {
        super(numero, palo);
    }

        
    
    @Override
    public String elDibujoDelNumero() {
     String [] numeros ={"","1","2","3","4","5","6","7","10","11","12"};
     return numeros[getNumero()];
    }

    @Override
    public String elDibujoDelPalo() {
        String[]palos = {"","ESPADA","ORO","COPA", "BASTO"};
        return palos[getPalo()];
    }
    
}

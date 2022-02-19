package cartas;

public final class CartaPoker extends Carta{

    public CartaPoker(int numero, int palo) {
        super(numero, palo);
    }

    @Override
    public String elDibujoDelNumero() {
        String []numeros = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        return numeros[getNumero()];
    }

    @Override
    public String elDibujoDelPalo() {
        String []palos = {"","♦","♣","♥","♠"};
        return palos[getPalo()];
    }
    
    
}

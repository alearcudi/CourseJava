package cartas;

public abstract class Carta implements Comparable{
    protected int numero;
    protected int palo;

    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "[" +  elDibujoDelNumero() +  elDibujoDelPalo() + "]";
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }

    public abstract String elDibujoDelNumero();

    public abstract String elDibujoDelPalo();

    @Override
    public int compareTo(Carta otra) {
        return this.numero-otra.numero;
    }
    
    
    
}

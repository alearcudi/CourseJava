package modelo;



public final class Ficha {
    
    public static final Ficha CRUZ    = new Ficha('X');
    public static final Ficha CIRCULO = new Ficha('O');
    public static final Ficha NADA    = new Ficha(' ');
    
    private char caracter;
    
    private Ficha(char caracter){
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return  "[" + caracter + "]";
    }
    
}

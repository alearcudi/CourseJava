package modelo;


public class JugadorComp1 extends Jugador {

    public JugadorComp1(String nombre, Ficha ficha) {
        super(nombre, ficha);
    }

    
    
    public JugadorComp1() {
      
    }

    @Override
    public Coordenada jugada(Tablero t) {
        int fila;
        int columna;
        
        do {
            fila= enteroRandom(t.getfInicial(),t.getfFinal());
            columna = enteroRandom(t.getcInicial(),t.getcFinal());
        } 
        while (t.get(fila, columna) !=Ficha.NADA);
     
        return new Coordenada(fila,columna);   
    }

    
    private int enteroRandom(int d, int h){
        return (int)(Math.random()* (h-d+1)+d);
        
    }
    
    
}

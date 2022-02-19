package modelo;





public class JugadorHumano extends Jugador{

    public JugadorHumano() {
       
    }

    public JugadorHumano(String nombre, Ficha ficha) {
        super(nombre, ficha);
    }

    @Override
    public Coordenada jugada(Tablero t) {
        int fila, columna;
        do{
            fila= Teclado.leerInt("fila: ", t.getfInicial(), t.getfFinal());
            columna = Teclado.leerInt("fila :",t.getcInicial(),t.getcFinal());
        }
        while(t.get(fila, columna)!= Ficha.NADA);
        
        
        return new Coordenada(fila, columna);
        
    }

    private int enteroRandom(int d, int h){
        return (int)(Math.random()*(h-d+1)+d);
    }
   
    
   
}

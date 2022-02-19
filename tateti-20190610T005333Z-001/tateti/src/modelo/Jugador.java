package modelo;




public abstract class  Jugador implements Jugable {
   
    private String nombre;
    private Ficha ficha;

    public Jugador() {
    }

    
    
     public Jugador(String nombre, Ficha ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Ficha getFicha() {
        return ficha;
    }

   
    
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
          
    
    
    
    
}

package mazos;

import cartas.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Mazo {
    protected List<Carta>lasCartas;

    public Mazo() {
        lasCartas = new ArrayList();
    }
    
    public Carta get(){
        return lasCartas.remove(0);
    }
    public Carta get(int posicion){
        return lasCartas.remove(posicion);
    }
    public void set(Carta c){
       lasCartas.add(c);
    }
    public void set(int posicion,Carta c){
       lasCartas.add(posicion, c);
    }
    
    public void mezclar(){
        Collections.shuffle(lasCartas);
    }
    
    public int tamanio(){
        return lasCartas.size();
    }
    
    @Override
    public String toString(){
        String cadena = "";
        
        for (Carta c : lasCartas) {
            cadena += c.toString();
        }
        return cadena;
    }
    
    public boolean vacio(){
        return lasCartas.isEmpty();
    }
    
    public void mostrar(){
        for (Carta c : lasCartas) {
            System.out.print(c);
        }
    }
    
    public Carta ver(int pos){
        
        return lasCartas.get(pos);
    }
    public Carta ver(){
        
        return lasCartas.get(0);
    }
    
    public abstract void llenar();
}

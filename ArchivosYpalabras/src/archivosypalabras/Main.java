package archivosypalabras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        
       List lista = new LinkedList(); 
       
       lista.add(new Alumno(1022, 7));
       lista.add(new Alumno(1121, 10));
       lista.add(new Alumno(3301, 1));
       
       Ranking x = new Ranking();
       
       
       x.listar("LISTADO DE ALUMNOS", lista);
        x.guardar("ALUMNOS.TXT", lista);
        
        lista = new ArrayList();
        
        lista.add(new Password());
        lista.add(new Password());
        lista.add(new Password());
        lista.add(new Password());
        lista.add(new Password());
        lista.add(new Password());
        lista.add(new Password());
         x.listar("Lista de contraseñas", lista);
      
    x.guardar("CONTRASEÑAS.TXT", lista);
    }
    
}

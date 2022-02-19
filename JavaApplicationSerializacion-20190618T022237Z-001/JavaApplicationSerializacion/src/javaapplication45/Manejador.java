    package javaapplication45;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manejador {

    private ArrayList<Persona> losAlumnos;
    private ArrayList<Persona> losEmpleados;
    private ArrayList<Persona> losDesocupados;

    private Map<  TipoPersona, List<Persona>   > map;

    public Manejador() {
        losAlumnos = crearAlumnos();
        losEmpleados = crearEmpleados();
        losDesocupados = crearDesocupados();
        map = new HashMap();
    }

    public void manejar() throws IOException, ClassNotFoundException {
        map.put(TipoPersona.ALUMNO    , losAlumnos);
        map.put(TipoPersona.DESOCUPADO, losDesocupados);
        map.put(TipoPersona.EMPLEADO  , losEmpleados);

        
        List lx = map.get(TipoPersona.ALUMNO);
        lx.add(new Alumno(10, 'F', "Rosa", 12345, 10));
        

        //map.get(TipoPersona.ALUMNO).add(new Alumno(10, 'F', "Rosa", 12345, 10));
        map.get(TipoPersona.ALUMNO).add(new Alumno(10, 'F', "carolina", 12345, 10));

        
        System.out.println("\nALUMNOS:     " + map.get(TipoPersona.ALUMNO));
        
        System.out.println("\nDESOCUPADOS: " + map.get(TipoPersona.DESOCUPADO)); 
        
        System.out.println("\nEMPLEADOS:   " + map.get(TipoPersona.EMPLEADO)); 
        
        System.out.println("TODOS: " + map);
         
        SerializarPersonas sp = new SerializarPersonas();

        sp.escritura(map);

        map = sp.lectura();

        Alumno a = (Alumno) sp.lectura(TipoPersona.ALUMNO, "carolina");

        System.out.println("a: " + a.toString());

        System.out.println("TODOS: " + map);
        
        map.forEach((k, v) -> System.out.println("Key: " + k + ": Value: " + v));
        //sp.lectura().get(TipoPersona.ALUMNO).forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
        System.out.println("ALUMNOS: " + sp.lectura().get(TipoPersona.ALUMNO));

    }

    private ArrayList<Persona> crearAlumnos() {
        ArrayList<Persona> lista = new ArrayList();

        lista.add(new Alumno(15, 'M', "Juan", 1010, 7));
        lista.add(new Alumno(16, 'F', "Juana", 1020, 8));
        lista.add(new Alumno(17, 'F', "Juanita", 1030, 9));
        lista.add(new Alumno(18, 'M', "Juancito", 1040, 5));

        return lista;
    }

    private ArrayList<Persona> crearEmpleados() {
        ArrayList<Persona> lista = new ArrayList();
        lista.add(new Empleado(25, 'M', "Raul", "25416489-2", "Cadete"));
        lista.add(new Empleado(30, 'F', "Mariana", "21411189-1", "Cajera"));
        lista.add(new Empleado(25, 'F', "Azul", "23965789-2", "Directora"));

        return lista;
    }

    private ArrayList<Persona> crearDesocupados() {
        ArrayList<Persona> lista = new ArrayList();
        lista.add(new Desocupado(44, 'M', "Dario", "20145874-9"));
        lista.add(new Desocupado(66, 'F', "Daria", "20111174-9"));
        lista.add(new Desocupado(44, 'F', "Rosita", "11145874-9"));
        lista.add(new Desocupado(44, 'O', "Darix", "44145874-9"));

        return lista;
    }
}

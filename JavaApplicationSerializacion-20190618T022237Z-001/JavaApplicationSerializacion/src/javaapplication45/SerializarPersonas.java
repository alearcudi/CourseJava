package javaapplication45;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializarPersonas{
    
    //CONSTANTE CON EL NOMBRE DE ARCHIVO POR DEFECTO
    private static final String NOMBRE_ARCHIVO = "PERSONAS.DAT";

    public void escritura(Map<TipoPersona, List<Persona>> map){
        File               archivo;
        FileOutputStream   salida;
        ObjectOutputStream escribe;
        
        try{
            
            archivo = new File(NOMBRE_ARCHIVO);
            salida  = new FileOutputStream(archivo);
            escribe = new ObjectOutputStream(salida);
            
            escribe.writeObject(map);
            escribe.close();
        }
        catch (NotSerializableException e){
            System.out.println("ERROR: NO IMPLEMENTA SERIALIZABLE");
        } 
        catch (IOException e){
            System.out.println("ERROR: NO SE PUDO ESCRIBIR EL ARCHIVO");
        }
    }

    
    public Persona lectura(TipoPersona tipo,String nombre){   
        
        
         List<Persona> lasPersonas =  lectura().get(tipo);
         
        for (int i = 0; i < lasPersonas.size(); i++){
            if (lasPersonas.get(i).getNombre().equals(nombre)){
                return lasPersonas.get(i);
            }
        }
        return null;
    }
    
    
    public List <Persona> lectura(TipoPersona tipo){   
        return lectura().get(tipo);
    }
    
    
    
    public Map<TipoPersona, List<Persona>> lectura(){
        
        Map<TipoPersona, List<Persona>> map = new HashMap();
        
        FileInputStream entrada;
        ObjectInputStream lee; 
        
        File archivo = new File(NOMBRE_ARCHIVO);
        if (archivo.exists()){
            try{
                entrada = new FileInputStream(archivo);
                lee = new ObjectInputStream(entrada);
                map = (Map<TipoPersona, List<Persona>>) lee.readObject();
            } 
            catch (ClassNotFoundException e){
                System.out.println("ERROR: CLASE NO ENCONTRADA");
            } 
            catch (EOFException e){
                System.out.println("ERROR: EL ARCHIVO ESTA ROTO");
                archivo.delete();

            }
            catch (IOException e){
                System.out.println("ERROR: NO SE PUEDE LEER EL ARCHIVO");
            }
        }
        return map;
    }
}

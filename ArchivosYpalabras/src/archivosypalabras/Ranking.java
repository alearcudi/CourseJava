package archivosypalabras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ranking {

    public void listar(String titulo,Collection lista){
        
        System.out.println(titulo);
        for(Object o : lista){
            System.out.println(o.toString());
        }
    }
    
    
    private void agregarAlFinal(String nombreArchivo ,String linea) {
        File           archivo;//ARCHIVO FISICO
        BufferedWriter bufferEscritura;//LUGAR EN MEMORIA
        FileWriter     flujoEscritura;//DIRECCION DEL FLUJO DE DATOS
        
        try {//BLOQUE CONTROLADO
            archivo = new File(nombreArchivo);
            if (!archivo.exists()) {//SI NO EXISTE
                archivo.createNewFile();//SE CREA NUEVO
            }
            //FLUJO DE ESCRITURA (TRUE ==> ESCRIBE AL FINAL)
            flujoEscritura = new FileWriter(archivo,true);
            bufferEscritura = new BufferedWriter(flujoEscritura);
            
            //"\r\n" ES UN SALTO DE LINEA
            bufferEscritura.write(linea + "\r\n");
            //SE TERMINA LA ESCRITURA
            bufferEscritura.close();
        } catch (IOException ex) {
            //EN CASO DE PROBLEMAS MUESTRA UN MENSAJE
            System.out.println(ex.getMessage());
        }
    }

    public void guardar(String nombreArchivo,List lista) {
        File           archivo;//ARCHIVO FISICO
        BufferedWriter bufferEscritura;//LUGAR EN MEMORIA
        FileWriter     flujoEscritura;//DIRECCION DEL FLUJO DE DATOS

        try {
            archivo = new File(nombreArchivo);
            if (!archivo.exists()) {//SI NO EXISTE
                archivo.createNewFile();//SE CREA NUEVO
            }
            //FLUJO DE ESCRITURA 
            flujoEscritura = new FileWriter(archivo);
            bufferEscritura = new BufferedWriter(flujoEscritura);
            for (Object x : lista) {
                bufferEscritura.write(x.toString() + "\r\n");
            }
            //SE TERMINA LA ESCRITURA
            bufferEscritura.close();
        } catch (IOException ex) {
            //EN CASO DE PROBLEMAS MUESTRA UN MENSAJE
            System.out.println(ex.getMessage());
        }
    }

    public List recuperar(String nombreArchivo) {
        List lista = new ArrayList();
        File archivo;
        BufferedReader bufferLectura;
        FileReader flujoLectura;
        String linea;
        try {
            archivo = new File(nombreArchivo);
            flujoLectura = new FileReader(archivo);
            if (archivo.exists())//Si existe el fichero
            {//Abre un flujo de lectura al fichero
                bufferLectura = new BufferedReader(flujoLectura);
                linea = bufferLectura.readLine();
                while (linea != null) {//Lee el fichero line a linea hasta llegar a la ultima

                    
                    //System.out.println(linea);
                    
                    lista.add(linea);

                    linea = bufferLectura.readLine();
                }
                bufferLectura.close();//Cierra el flujo
            }
        } catch (IOException ex) {//Captura un posible error y le imprime en pantalla
            System.out.println("\nError: " + ex.getMessage());
        }
        return lista;
    }
}

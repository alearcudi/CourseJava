package luminomappal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Protex {
    
    private String ruta = "C:\\Users\\ITMaster\\Desktop\\";
    private Map<String,List<String>> mapa;

    public Protex() {
        mapa = new HashMap();
    }
    
    public void mostrar(){
       Set claves = mapa.keySet();
       for(Object clave :claves) {
           List lista = mapa.get(clave);
           System.out.println("CLAVE: "+clave.toString());
           for(Object palabra:lista){
               System.out.println(palabra.toString());
           } 
       }
    }
    
    public void llenar(String nombreArchivo){
        File           archivo;
        BufferedReader bufferDeLectura;
        FileReader     flujoDeLectura;
        String linea = "";

        try {
            archivo = new File(ruta+nombreArchivo);
            if (archivo.exists()) {
                flujoDeLectura  = new FileReader(archivo);
                bufferDeLectura = new BufferedReader(flujoDeLectura);
                
                linea = bufferDeLectura.readLine();
                while (linea != null) {
                   
                    procesoUnaLinea(linea);
                    
                    
                    
                    linea = bufferDeLectura.readLine();
                }
                bufferDeLectura.close();
                System.out.println("\nOK: ARCHIVO LEIDO CORRECTAMENTE!");
            }
            else {
                archivo.createNewFile();
                System.out.println("\nOK: ARCHIVO CREADO VACIO!");
            }
        } catch (IOException ex) {
            System.out.println("\nError: " + ex.getMessage());
        }

    }

    private void procesoUnaLinea(String linea) {
        String palabra="";
        linea = linea.toLowerCase();
        int i = 0;
        while(i<linea.length()){
            //MIENTRAS NO SE TEMINE LA LINEA
            while(i<linea.length() && !Character.isLetter(linea.charAt(i))){
                //MIENTRAS NO SE TEMINE LA LINEA Y NO ES LETRA
                    i++;//PASO AL SIG. CARACTER
            }  
            palabra = "";
            while(i<linea.length() && Character.isLetter(linea.charAt(i))){
                //MIENTRAS NO SE TEMINE LA LINEA Y SI ES LETRA
                palabra = palabra + linea.charAt(i);
                    i++;//PASO AL SIG. CARACTER
            }  
            String clave = "";
           
            if (palabra.length() > 0) {
                clave = palabra.charAt(0)+"";

                List lp =  mapa.get(clave);
                if (lp==null) {//NO ESTA!!!!
                    lp = new ArrayList();
                    lp.add(palabra);
                    mapa.put(clave, lp);
                }
                else{
                    lp.add(palabra);
                }
                
            }
            
        }
    }
    
}

package lumimaseri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lispal {
    
    private Map<Integer,List<String>> m;

    public Lispal() {
        m = new HashMap();
    }
    
    public void llenar(String nombreArchivo ){
        File           archivo;
        BufferedReader bufferDeLectura;
        FileReader     flujoDeLectura;
        String linea = "";
        String []separadas;

        try {
            archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                flujoDeLectura = new FileReader(archivo);
                bufferDeLectura = new BufferedReader(flujoDeLectura);
                linea = bufferDeLectura.readLine();
                while (linea != null) {
                    separadas = linea.split(" ");
                    int clave;
                    for (int i = 0; i < separadas.length; i++) {
                        clave = separadas[i].length();
                        String dato = separadas[i];
                        List lp = m.get(clave);
                        if (lp==null) {
                            List x = new ArrayList();
                            x.add(dato);
                            m.put(clave,x);
                        }
                        else{
                            lp.add(dato);
                        }
                    }
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
    public void mostrar(){
      
        Set conjuntodeClaves = m.keySet();
        for (Object clave: conjuntodeClaves) {
            System.out.println("CLAVE: " + clave.toString());
            List lista = m.get(clave);
            for(Object str: lista){
                System.out.println(str.toString());
            }
        }
        
    }
    
    
    
    
}

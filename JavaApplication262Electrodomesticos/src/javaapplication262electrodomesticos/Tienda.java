package javaapplication262electrodomesticos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author ITMaster
 */
public class Tienda {

 private static final String NOMBRE_ARCHIVO = "ARTICULOS.TXT";
    
    private static final Object NO_ENCONTRADO = null;
    private static final int ALTA = 1;
    private static final int BAJA = 2;
    private static final int MODI = 3;
    private static final int LISTADO = 4;
    private static final int GUARDAR = 5;
    private static final int RECUPERAR = 6;

    //ATRIBUTOS DE INSTNCIA
    private String nombre;
    private ArrayList<Electrodomestico> articulos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        articulos = new ArrayList();

    }

    public void inicio() {

        int opcion = 0;

        recuperar();

        do {
            opcion = new Selector("MENU " + nombre + ",Alta,Baja,Modi,"
                    + "listado,Guardar,Recuperar").getOpcion();
            switch (opcion) {
                case ALTA:
                    hacerAlta();
                    break;
                case BAJA:
                    hacerBaja();
                    break;
                case MODI:
                    hacerModi();
                    break;
                case LISTADO:
                    hacerListado();
                    break;
                case GUARDAR:
                    guardar();
                    break;
                case RECUPERAR:
                    recuperar();
                    break;
            }
        } while (opcion != Selector.SALIR);

        guardar();

    }

    private void recuperar() {
        
        File           archivo; //ARCHIVO FISICO
        BufferedReader lee;     //BUFFER DE MEMORIA  
        FileReader     entrada; //FLUJO DE ENTRADA
        String         linea;   //LINEA DE TEXTO PARA LA LECTURA

        //INSTANCIAMOS LA LISTA DE ARTICULOS
        articulos = new ArrayList();
        
        //ASOCIAMOS EL NOMBRE FISICO DEL ARCHIVO A NUESTRO NOMBRE LOGICO
        archivo = new File(NOMBRE_ARCHIVO);
        
        try{ //VIGILAMOS EL PROCESO DE ENTRADA SALIDA
            if(archivo.exists()){//SI EXISTE EL ARCHIVO?
                //ABRIMOS EL FLUJO DE LECTURA
                entrada = new FileReader(archivo);
                //ASOCIAMOS EL FLUJO DE LECTURA AL BUFFER 
                lee = new BufferedReader(entrada);
                //LEEMOS LA PRIMER LINEA
                linea = lee.readLine();
                while(linea != null){//MIENTRAS NO SE TERMINE EL ARCHIVO
                    //PROCESAMOS LA LINEA LEIDA
                    articulos.add(getObjetoQueCorresponda(linea));
                    //LEEMOS LA SIG. LINEA
                    linea = lee.readLine();
                }//FIN WHILE (SE TERMINARON LOS DATOS)
                //CERRAMOS EL FLUJO DE DATOS
                lee.close();
                System.out.println("\nOK: ARCHIVO LEIDO CORRECTAMENTE!");
            }
            else{//SI NO EXISTE EL ARCHIVO
                //CREANOS UN NUEVO ARCHIVO
                archivo.createNewFile();
                System.out.println("\nOK: ARCHIVO CREADO CORRECTAMENTE!");
            }
        }catch (IOException ex){
            //SI OCURRE, CAPTURAMOS LA EXCEPCION 
          System.out.println("\nError: " + ex.getMessage());
        }
      
    }
    
    private Electrodomestico getObjetoQueCorresponda(String linea) {
        Electrodomestico unElectrodomestico = null;

        //SEPARAMOS EL NOMBRE DE LA CLASE DE LOS ATRIBUTOS
        String[] separados = linea.split(";");

        //SELECCIONAMOS SEGUN EL NOMBRE DE LA CLASE
        switch (separados[0]) {
            case "Lavadora":
                unElectrodomestico = new Lavadora(separados[1]);
                break;
            case "Television":
                unElectrodomestico = new Television(separados[1]);
                break;
            case "Heladera":
                unElectrodomestico = new Heladera(separados[1]);
                break;
        }
        return unElectrodomestico;
    }

    private void guardar(){
        File           archivo;//ARCHIVO FISICO 
        BufferedWriter escribe;//BUFFER DE ESCRITURA
        FileWriter     salida; //FLUJO DE SALIDA
        
        //ASOCIAMOS EL ARCHIVO FISICO AL LOGICO 
        archivo = new File(NOMBRE_ARCHIVO);
        try{
            if (!archivo.exists()){//SI NO EXISTE EL ARCHIVO
                //GREAMOS EL NUEVO ARCHIVO
                archivo.createNewFile();
                System.out.println("\nOK: ARCHIVO CREADO CORRECTAMENTE!");
                
            }
            //ASOCIAMOS EL ARCHIVO AL FLUJO DE SALIDA 
            salida = new FileWriter(archivo.getAbsoluteFile());
            //ASOCIAMOS EL FLUJO DE SALIDA AL BUFFER 
            escribe = new BufferedWriter(salida);
            //RECORREMOS LA LISTA HASTA EL FINAL
            for (int i = 0; i < articulos.size(); i++){
                //ESCRIBE CADA LINEA EN EL ARCHIVO AGREGANDO  "\r\n" AL FINAL
                escribe.write(articulos.get(i).getClass().getSimpleName()
                        +";"+articulos.get(i).toString() + "\r\n");
            }
            //CERRAMOS EL FLUJO DE ESCRITURA
            escribe.close();
            System.out.println("\nOK: ARCHIVO GUARDADO CORRECTAMENTE!");
        } 
        catch (IOException e){
            //CAPTURAMOS LA EXCEPCION
            System.out.println(e.getMessage());
        }
    }


    private void hacerAlta() {
        
        Electrodomestico e=null;
        
        switch(new Selector("TIPO DE ELECTRODOMESTICO,HELADERA,TELEVISOR,LAVADORA").getOpcion()){
            case 1:
                e = Heladera.getInstance();
            break;   
            case 2:
                e = Television.getInstance();
            break;   
            case 3:
                e = Lavadora.getInstance();
            break;   
        } 
        if (Teclado.confirma("Confirma el alta del articulo?")) {
            articulos.add(e);
        }
        
    }

    private void hacerListado() {
        System.out.println("LISTADO DE ARTICULOS");
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i).toString());
        }
    }

    private void hacerBaja() {
        int codigo;
        
        codigo = Teclado.leerInt("Codigo: ");
        Electrodomestico articuloEncontrado = buscarUnArticulo(codigo);
        if (articuloEncontrado == NO_ENCONTRADO) {
            System.out.println("NO EXISTE EL ARTICULO");
        }
        else{
            articulos.remove(articuloEncontrado);
        }
    }

    private void hacerModi() {
        int codigo;

        
        codigo = Teclado.leerInt("Codigo: ");
        Electrodomestico articuloEncontrado = buscarUnArticulo(codigo);
        if (articuloEncontrado == NO_ENCONTRADO) {
            System.out.println("NO EXISTE EL ARTICULO");
        }
        else{
            articuloEncontrado.mostrar();
           
            
            
           
            int opcion=0;
           
            do {
                String s= getCadena(articuloEncontrado);
                opcion = new Selector(s).getOpcion();
                switch (opcion){
                    case 1:
                        articuloEncontrado.nombre = Teclado.leerTexto("Nuevo nombre: ");
                    break;
                    case 2:
                        articuloEncontrado.consumoEnergetico = 
                                Teclado.leerChar("Nuevo Consumo: ","ABCDEF");
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    case 6:
                    break;
                    case 7:
                    break;
                    
                    
                }
            } while (opcion!=Selector.SALIR);
            
        }
        
        
    }

    private Electrodomestico buscarUnArticulo(int codigo) {
        for (int i = 0; i < articulos.size(); i++) {
            if (codigo==articulos.get(i).getCodigo()) {
               return articulos.get(i);
            }
        }
        return null;
    }

    private String getCadena(Electrodomestico articuloEncontrado) {
        
        Heladera h;
        Television t;
        Lavadora l;
        
         String [] sep =articuloEncontrado.toString().split(",");
            String s = "Articulo: " + sep[4] + "," + "nombre: " + sep[5]
                    + "," + "consumo: " + sep[2] + "," + "color: " + sep[3] + ","
                    + "precio: " + sep[0] + "," + "peso: " + sep[1];
        
        switch(articuloEncontrado.getClass().getSimpleName()){
            case "Heladera":
                h = (Heladera) articuloEncontrado;
                s += "," + "Capacidad: "+h.getCapacidad();
            break;    
            case "Television":
                t = (Television) articuloEncontrado;
                s+=","+"Pulgadas: "+t.getResolucion()+","+"Tiene sint.: "+t.isSintonizadorTDT();
            break;    
            case "Lavadora":
                l = (Lavadora) articuloEncontrado;
                s+= ","+"Carga: "+l.getCarga();
            break;    
        }
        
        return s;
        
       
            
    }

}




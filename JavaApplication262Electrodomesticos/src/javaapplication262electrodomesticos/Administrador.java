
package javaapplication262electrodomesticos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Administrador {
    public static final String  RUTA = "C:\\Users\\ITMaster\\Desktop\\";
    public static final String  NOMBRE_ARCHIVO = "ARTICULOS.TXT";
    
    public static final String  NOMBRE_COMPLETO = RUTA + NOMBRE_ARCHIVO;
    
    private String nombre;
    private ArrayList<Electrodomestico>articulos;
    
//ATRIBUTOS DE CLASE (CONSTANTES)
    private static final int ARTICULOS = 1;
    private static final int CLIENTES = 2;
    private static final int SALIDA = 99;
    
    //ARTICULOS
     private static final int ALTA_ARTICULOS=1;
     private static final int BAJA_ARTICULOS=2;
     private static final int LISTA_ARTICULOS=3;
     private static final int BUSQUEDA_ARTICULOS=4;
     private static final int RECUPERAR_DESDE_ARCHIVO=5;
     private static final int GUARDAR_EN_ARCHIVO=6;
     
     //LISTADOS
     private static final int LISTADO_TODOS=1;
     private static final int LISTADO_HELADERAS=2;
     private static final int LISTADO_TELEVISORES=3;
     private static final int LISTADO_LAVADORAS=4;

     public Administrador (String nombre) {
        this.nombre = nombre;
        articulos = new ArrayList();
     }

        
    private void recuperar(){
        File           archivo; //ARCHIVO FISICO
        BufferedReader lee;     //BUFFER DE MEMORIA  
        FileReader     entrada; //FLUJO DE ENTRADA
        String         linea;   //LINEA DE TEXTO PARA LA LECTURA
        
        //INSTANCIAMOS LA LISTA DE ARTICULOS
        articulos = new ArrayList();
        
        //ASOCIAMOS EL NOMBRE FISICO DEL ARCHIVO A NUESTRO NOMBRE LOGICO
        archivo = new File(NOMBRE_COMPLETO);
        
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

    private Electrodomestico getObjetoQueCorresponda(String linea)
    {
        Electrodomestico unElectrodomestico = null;
        //SEPARAMOS EL NOMBRE DE LA CLASE DE LOS ATRIBUTOS
        String [] separados = linea.split(";");
        //SELECCIONAMOS SEGUN EL NOMBRE DE LA CLASE
        switch(separados[0]){
            case "Lavadora":unElectrodomestico=new Lavadora(separados[1]);break;
            case "Television":unElectrodomestico=new Television(separados[1]);break;
            case "Heladera":unElectrodomestico= new Heladera(separados[1]);break;
        }
        return unElectrodomestico;
    }
    
    
    public void inicio() {
        //RECUPERAMOS LA LISTA DE ARTICULOS DESDE EL ARCHIVO
        recuperar();
        int opcion = 0;
        do{ 
            opcion=new Selector("MENU PRINCIPAL,ARTICULOS,CLIENTES").getOpcion();
            switch(opcion){
                case ARTICULOS: accederArticulos(); break;
                case CLIENTES:  accederClientes();  break;
            }
        }while(opcion != SALIDA);
        guardar();
    }

    private void accederArticulos(){
        int opcion = 0;
        do{ 
            opcion = new Selector("TIENDA VM\nMANEJO DE "
                    + "ELECTRODOMESTICOS,ALTA,BAJA,LISTA,BUSQUEDA,"
                    + "RECUPERAR,GUARDAR").getOpcion();
                    switch(opcion){
                        case ALTA_ARTICULOS:altaArticulos(); break;
                        case BAJA_ARTICULOS:bajaArticulos(); break;
                        case LISTA_ARTICULOS:listaArticulos(); break;  
                        case BUSQUEDA_ARTICULOS:busquedaArticulos(); break;
                        case RECUPERAR_DESDE_ARCHIVO:recuperar();break;
                        case GUARDAR_EN_ARCHIVO:guardar(); break;
                    }
        }while(opcion!=SALIDA);
    }

    private void accederClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void altaArticulos() {
        int salir = 0;
        String opciones=",HELADERAS,LAVADORAS,TELEVISORES";
        int opcion =0;
        Electrodomestico x=null;
        do {opcion = new Selector (opciones).getOpcion();
            switch(opcion){
                case 1: x = Heladera.getInstance(); break;
                case 2: x = Lavadora.getInstance(); break;
                case 3: x = Television.getInstance(); break;
            }
            articulos.add(x);//agregar un articulo en la memoria
            agregarAlFinal(x);//guardamos un articulo en el disco
        } while(opcion!=SALIDA);
                
    }

    
    
    private void bajaArticulos(){
        
        int codigo;
        
        codigo = Teclado.leerInt("INGRESE EL CODIGO A ELIMINAR: ", 1000, 9999);
        Electrodomestico x = buscar(codigo);
        if (x==null) {
            System.out.println("NO EXISTE EL ARTICULO!!!");
        }
        else{
            articulos.remove(x);
            System.out.println("ARTICULO ELIMINADO!!!");
        }
    }
    
    private void guardar(){
        File           archivo;//ARCHIVO FISICO 
        BufferedWriter escribe;//BUFFER DE ESCRITURA
        FileWriter     salida; //FLUJO DE SALIDA
        
        //ASOCIAMOS EL ARCHIVO FISICO AL LOGICO 
        archivo = new File(NOMBRE_COMPLETO);
        try{
            if (!archivo.exists()){//SI NO EXISTE EL ARCHIVO
                //GREAMOS EL NUEVO ARCHIVO
                archivo.createNewFile();
            }
            //ASOCIAMOS EL ARCHIVO AL FLUJO DE SALIDA 
            salida = new FileWriter(archivo.getAbsoluteFile());
            //ASOCIAMOS EL FLUJO DE SALIDA AL BUFFER 
            escribe = new BufferedWriter(salida);
            //RECORREMOS LA LISTA HASTA EL FINAL
            for (int i = 0; i < articulos.size(); i++){
                //ESCRIBE CADA LINEA EN EL ARCHIVO AGREGANDO  "\r\n" AL FINAL
                escribe.write(articulos.get(i).toString() + "\r\n");
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
    
    private void agregarAlFinal(Electrodomestico unElectrodomestico){
        File           archivo;//ARCHIVO FISICO 
        BufferedWriter escribe;//BUFFER DE ESCRITURA
        FileWriter     salida; //FLUJO DE SALIDA
        //ASOCIAMOS EL ARCHIVO FISICO AL LOGICO
        archivo = new File(NOMBRE_COMPLETO);
        try{ 
            if (!archivo.exists()){
                //SI NO EXISTE, LO CREAMOS
                archivo.createNewFile();
            }
            //ASOCIAMOS ELARCHIVO AL FLUJO DE SALIDA PARA AGREGAR
            //FileWriter(archivo,true) TRUE ES LO IMPORTANTE PARA AGREGAR
            salida = new FileWriter(archivo,true);
            //ASOCIAMOS EL FLUJO AL BUFFER
            escribe = new BufferedWriter(salida);
            //ESCRIBMOS AL FINAL DEL ARCHIVO LA LINEA.
            escribe.write(unElectrodomestico.getClass().getSimpleName()+";"+ unElectrodomestico.toString() + "\r\n");
            //CERRAMOS EL FLUJO DE ESCRITURA
            escribe.close();
            System.out.println("\nOK: LINEA AGREGADA CORRECTAMENTE AL ARCHIVO!");
        } 
        catch (IOException e)
        {
            //CAPTURAMOS LA POSIBLE EXEPCION
            System.out.println(e.getMessage());
        }
    }
    
    private void listaArticulos() {
        ArrayList <Electrodomestico> x=null;
        String opciones = "LISTADO DE ARTICULOS,"
                    + "TODOS,HELADERAS,TELEVISORES,LAVADORAS";
        int opcion;
        
        do{
            opcion = new Selector(opciones).getOpcion();
            switch(opcion){
                case LISTADO_TODOS:
                    x=getLista(Electrodomestico.class);
                break;
                case LISTADO_HELADERAS:
                    x=getLista(Heladera.class);
                break;
                case LISTADO_TELEVISORES:
                    x=getLista(Television.class);
                break;
                case LISTADO_LAVADORAS:
                    x=getLista(Lavadora.class);
                break;
            }
            if (opcion!=SALIDA){
                System.out.println("LISTADO DE ARTICULOS");
                for (int i = 0; i < x.size(); i++){
                    System.out.println(x.get(i).toString());
                }
            }
        }while (opcion!=SALIDA);
    }

    private void busquedaArticulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList <Electrodomestico> getLista (Class clase) {
        ArrayList <Electrodomestico> x = new ArrayList();
        for (int i = 0; i < articulos.size(); i++) {
            //System.out.println(articulos.get(i));
            if (articulos.get(i).getClass().getSimpleName().equals(clase.getSimpleName())){
                x.add(articulos.get(i));
            }
        }
        return x;
    }

    private Electrodomestico buscar(int codigo) 
    {
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).codigo==codigo) {
                return articulos.get(i);
            }
        }
        return null;
    }
}
        
   


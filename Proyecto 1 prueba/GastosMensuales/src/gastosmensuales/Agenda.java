package gastosmensuales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Agenda {

    private static final String RUTA = "C:\\Users\\jair\\Desktop\\";

    private final String nombreArchivo;
    private ArrayList<Gasto> losGastos;

    public Agenda() {
        nombreArchivo = RUTA + "agenda.xls";
        losGastos = new ArrayList();

    }

    public Agenda(String nombreArchivo) {
        this.nombreArchivo = RUTA + nombreArchivo;
        losGastos = new ArrayList();

    }

    public void inicio() {
        String opcion = "";
        recuperarLaAgenda ();
        do {
            opcion = new Selector("Gastos,"
                    + "Agregar   Un Gasto,"
                    + "Buscar    Un Gasto,"
                    + "Eliminar  Un Gasto,"
                    + "Modificar Un Gasto,"
                    + "Mostrar   Los Gastos,"
                    + "Guardar   Los Gastos,"
                    + "Recuperar Los Gastos,"
            ).getOpcion();

            switch (opcion) {
                case "1":
                    agregarUnGasto();
                    break;
                case "2":
                    buscarUnGasto();
                    break;
                case "3":
                    eliminarUnGasto();
                    break;
                case "4":
                    modificarUnGasto();
                    break;
                case "5":
                    mostrarLosGastos();
                    break;
                case "6":
                    guardarLosGastos();
                    break;
                case "7":
                    recuperarLaAgenda ();
                    break;
            }
        } while (!opcion.equals("SALIR"));
        guardarLosGastos();

    }

    private void agregarUnGasto () {
        Gasto c = new Gasto();

        String opcion = new Selector("Agregar Un Contacto En Memoria,"
                + "Desde Teclado,En Forma Random,Cancelar Operacion").getOpcion();
        switch (opcion) {
            case "1":
                c = Gasto.getInstance();
                break;
            case "2":
                c = Gasto.getGastoRandom();
                break;
        }

        if (!opcion.equals("3")) {
            if (losGastos.add(c)) {
                System.out.println("GASTO AGREGADO CORRECTAMENTE!");
            }
            else {
                System.out.println("ERROR AL AGREGAR EL GASTO");
            }
            

        }
    }

    private void buscarUnGasto() {
        System.out.println("\nBuscar Un Gasto\n");
        int idBuscado = Teclado.leerInt("Id (1..20000): ", 1, 20000);

        Gasto contactoEncontrado = buscarContacto(idBuscado);
        if (contactoEncontrado == null) {
            System.out.println("El Gasto No Existe en La Agenda!!!");
        }
        else {
            contactoEncontrado.mostrar();
        }

    }

    private void eliminarUnGasto() {
        System.out.println("\nEliminar Un Gasto\n");
        int idBuscado = Teclado.leerInt("Id (1..20000): ", 1, 20000);

        Gasto contactoencontrado = buscarContacto(idBuscado);
        if (contactoencontrado == null) {
            System.out.println("El Gasto No Existe en La Agenda!!!");
        }
        else {
            contactoencontrado.mostrar();
            if (Character.toUpperCase(Teclado.leerChar("Desea Eliminar Al "
                    + "Gasto (S/N): ", "SNsn")) == 'S') {
                losGastos.remove(contactoencontrado);
                System.out.println("El Gasto Fue Eliminado !!!");
            }

        }

    }

    private void modificarUnGasto() {

        System.out.println("A Cargo Del Alumno!");
    }

    private void guardarLosGastos() {
        File archivo;
        BufferedWriter escribe;
        FileWriter flujoEscritura;

        try {
            archivo = new File(nombreArchivo);

            if (!archivo.exists()) {//Si no Existe el fichero lo crea
                archivo.createNewFile();
            }
            flujoEscritura = new FileWriter(archivo.getAbsoluteFile());
            escribe = new BufferedWriter(flujoEscritura);
            for (int i = 0; i < losGastos.size(); i++) {
                escribe.write(losGastos.get(i).toString() + "\r\n");
            }
            escribe.close();
            System.out.println("\nOK: ARCHIVO GUARDADO CORRECTAMENTE!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void recuperarLaAgenda() {
        File archivo;
        BufferedReader bufferDeLectura;
        FileReader flujoDeLectura;
        String linea = "";
        
        try {
            archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                flujoDeLectura = new FileReader(archivo);
                bufferDeLectura = new BufferedReader(flujoDeLectura);
                linea = bufferDeLectura.readLine();
                while (linea != null) {
                    losGastos.add(new Gasto(linea));
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
            System.out.println("\nError : " + ex.getMessage());
        }

    }

    private void mostrarLosGastos() {
        System.out.println("\nListado de los datos de la agenda\n");
        for (Gasto c : losGastos) {
            System.out.println(c);
        }

    }

    public void eliminar(int id) {
        boolean encontre = false;
        Gasto muere = null;
        
        for (int i = 0; i < losGastos.size() && !encontre; i++) {
            if (id == losGastos.get(i).getId()) {
                encontre = true;
                muere = losGastos.get(i);
            }
        }

        if (encontre) {
            losGastos.remove(muere);
            guardarLosGastos();
            System.out.println("GASTO ELIMINADO!!!!!");
        }
        else {
            System.out.println("\nNO EXISTE EL GASTO!!");
        }
    }

    private Gasto buscarContacto(int idBuscado) {
        for (Gasto c : losGastos) {
            if (idBuscado == c.getId()) {
                return c;
            }
        }
        return null;
    }
}

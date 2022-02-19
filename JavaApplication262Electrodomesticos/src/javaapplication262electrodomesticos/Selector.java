package javaapplication262electrodomesticos;

public class Selector {
    public static final int SALIR = 99;
    private String[]opciones;
    private int opcion;
   
    public Selector (String lasOpciones) {
        opciones=lasOpciones.split(",");
        opcion=0;
    }

    public int getOpcion() {
        int j;
        System.out.println("------------------------------------");
        System.out.println(opciones[0]);
        System.out.println("------------------------------------");
        for ( j = 1; j < opciones.length; j++) {
            System.out.println("("+j+")" + "------------------" + 
                    opciones[j]);
                   }
        System.out.println("------------------------------------");
        System.out.println("("+j+")"+ "-----------------" + "SALIR");
        System.out.println("------------------------------------");
        
        int op =Teclado.leerInt("INGRESE UNA OPCION: ", 1, opciones.length);
        return  op==opciones.length?SALIR:op;
         
    }
        
}
    

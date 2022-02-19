/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;

/**
 *
 * @author ITMaster
 */
public class Tablero {
    
    private static final int FILAS = 3;
    private static final int COLUMNAS = 3;
    private Ficha [][] lasFichas;
    private int fInicial;
    private int fFinal;
    private int cInicial;
    private int cFinal;
    
    public Tablero() {
        lasFichas = new Ficha[FILAS][COLUMNAS];
        fInicial = 0;
        fFinal = FILAS-1;
        cInicial=0;
        cFinal = COLUMNAS-1;
        llenar(Ficha.NADA);    
    }

    private void llenar(Ficha ficha) {
        for (int fila = getfInicial(); fila <= getfFinal(); fila++) {
            for (int columna  = getcInicial(); columna  <= getcFinal(); columna ++) {
                set(fila,columna,ficha);
            }
        }
    }
    public void mostrar() {
        for (int fila = getfInicial(); fila <= getfFinal(); fila++) {
            for (int columna  = getcInicial(); columna  <= getcFinal(); columna ++) {
                System.out.print(get(fila, columna));
            }
            System.out.println("");
        }
    }

    public void set(int fila, int columna, Ficha ficha) {
        lasFichas[fila][columna]= ficha;
    }
    
    public Ficha get(int fila, int columna){
        return lasFichas[fila][columna];
    }

    public int getcFinal() {
        return cFinal;
    }

    public int getcInicial() {
        return cInicial;
    }

    public int getfFinal() {
        return fFinal;
    }

    public int getfInicial() {
        return fInicial;
    }
    
    public boolean filaIgual(int fila,Ficha ficha){
        for (int columna = cInicial; columna <= cFinal; columna++) {
            if (get(fila, columna)!=ficha) {
                return false;
            }
        }
        return true;
    }
    public boolean columnaIgual(int columna,Ficha ficha){
        for (int fila = fInicial; fila <= fFinal; fila++) {
            if (get(fila, columna)!=ficha) {
                return false;
            }
        }
        return true;
    }
    
    public boolean diagPrinIgual(Ficha ficha){
        for (int x = fInicial; x <= fFinal; x++) {
            if (get(x, x)!=ficha) {
                return false;
            }
        }
        return true;
    }
    public boolean diagSecIgual(Ficha ficha){
        int fila;
        int columna;
        
        for (fila= fInicial,columna=cFinal; fila <= fFinal; fila++,columna--) {
            if (get(fila, columna)!=ficha) {
                return false;
            }
        }
        return true;
    }
    
    
}

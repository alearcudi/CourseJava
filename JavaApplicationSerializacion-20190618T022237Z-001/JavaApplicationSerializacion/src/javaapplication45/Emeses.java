/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author ITMaster
 */
public enum Emeses {
    ENERO("Enero",31,1),FEBRERO("Febrero",28,2);
    private String nombre;
    private int dias;
    private int nMes;
    
   Emeses(String nombre,int dias,int nMes){
        this.nombre = nombre;
        this.dias = dias;
        this.nMes = nMes;
    }

    public int getnMes() {
        return nMes;
    }

    

    public String getNombre() {
        return nombre;
    }

    

    public int getDias() {
        return dias;
    }

    
   
}

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
public enum Meses {
    ENERO("Enero",31),FEBRERO("Enero",31),MARZO("Enero",31),
    ABRIL("Enero",31),MAYO("Enero",31),JUNIO("Enero",31),
    JULIO("Enero",31),AGOSTO("Enero",31),SEPTIEMBRE("Enero",31),
    OCTUBRE("Enero",31),NOVIEMBRE("Enero",31),DICIEMBRE("Enero",31);
    
    private String nombre;
    private int cantDias;
    
    private Meses(String nombre,int cantDias){
        this.nombre   = nombre;
        this.cantDias = cantDias;
    }

    public int getCantDias() {
        return cantDias;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}

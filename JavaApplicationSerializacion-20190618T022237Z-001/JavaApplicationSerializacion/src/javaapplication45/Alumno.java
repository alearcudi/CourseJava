/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author User
 */
public class Alumno extends Persona
{
    private int legajo;
    private int nota;

    
    public Alumno(int edad, char sexo, String nombre,int legajo, int nota )
    {
        super(edad, sexo, nombre);
        this.legajo = legajo;
        this.nota = nota;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Legajo: " + legajo + " Nota: " + nota;
    }

    public int getNota()
    {
        return nota;
    }

    public void setNota(int nota)
    {
        this.nota = nota;
    }

    public int getLegajo()
    {
        return legajo;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }
        
}

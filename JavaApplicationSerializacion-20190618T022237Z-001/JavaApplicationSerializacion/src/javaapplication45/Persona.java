/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.io.Serializable;

/**
 *
 * @author User
 */
public abstract class Persona implements Serializable
{
    private int edad;
    private char sexo;
    private String nombre;

    public Persona(int edad, char sexo, String nombre)
    {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return "Edad: " + edad + " Sexo: " + sexo + " Nombre: " + nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    
    
}

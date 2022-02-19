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
public class Desocupado extends Persona
{
    private String cuil;

    public Desocupado(int edad, char sexo, String nombre,String cuil)
    {
        super(edad, sexo, nombre);
        this.cuil = cuil;
    }

    @Override
    public String toString()
    {
        return super.toString() +" Cuil: " + cuil ;
    }

   

    public String getCuil()
    {
        return cuil;
    }

    public void setCuil(String cuil)
    {
        this.cuil = cuil;
    }
    
}

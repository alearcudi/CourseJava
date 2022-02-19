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
public class Empleado extends Persona
{
    private String cuil;
    private String puesto;

    public Empleado(int edad, char sexo, String nombre,String cuil, String puesto)
    {
        super(edad, sexo, nombre);
        this.cuil = cuil;
        this.puesto = puesto;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Cuil: " + cuil + " Puesto: " + puesto ;
    }


    public String getCuil()
    {
        return cuil;
    }

    public void setCuil(String cuil)
    {
        this.cuil = cuil;
    }

    public String getPuesto()
    {
        return puesto;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }
    
    
}

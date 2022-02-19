package javaapplication45;

public enum TipoPersona{
    ALUMNO("Alumno"),
    EMPLEADO("Empleado"),
    DESOCUPADO("Desocupado");
    
    private String nombre;
    
    private TipoPersona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}

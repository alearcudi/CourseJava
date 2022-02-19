package javaapplication262electrodomesticos;


public class Heladera extends Electrodomestico{
    public final static int CAPACIDAD_DEF= 150;
    private int capacidad;
    
    public Heladera()
    { this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, 
            CODIGO_DEF,NOMBRE_DISPONIBLES[2], CAPACIDAD_DEF);
    }
    
    public Heladera (double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF,
                COLOR_DEF, CODIGO_DEF,NOMBRE_DEF,CAPACIDAD_DEF);
    }
   
    public Heladera(double precioBase, double peso, char consumoEnergetico,
            String color, int codigo, String nombre,int capacidad){
         super (precioBase,peso, consumoEnergetico,color, codigo,nombre);
         this.capacidad= capacidad;
     }

    public Heladera(String sLosAtt){
        String[]sep = sLosAtt.split(",");
        
        this.setPrecioBase(Double.parseDouble(sep[0]));
        this.setPeso(Double.parseDouble(sep[1]));
        this.setConsumoEnergetico(comprobarConsumoEnergetico(sep[2].charAt(0)));
        this.setColor(comprobarColor(sep[3]));
        this.setCodigo(Integer.parseInt (sep[4]));
        this.setNombre(comprobarNombre(sep[5]));
        this.capacidad = Integer.parseInt(sep[6]);
    }    
      
    
    public int getCapacidad()
    {
        return capacidad;
    }

    @Override
    public String toString(){
        return super.toString() + "," + capacidad;
    }
    
    public void mostrar(){
        System.out.println(
                   "\nHeladera" 
                 + "\nPrecio Base: " + getPrecioBase() 
                 + "\nnombre: " + getNombre ()
                 + "\ncodigo: " + getCodigo()
                 + "\nColor: " + getColor() 
                 + "\nConsumo Energetico: " + getConsumoEnergetico() 
                 + "\nPeso: " + getPeso() 
                 + "\nCapacidad: " + capacidad
                 + "\nPrecio Final: " + precioFinal()
        );
    }
    public double precioFinal() {
        double plus = super.precioFinal();
        if (capacidad>200){
                plus+=100;
        }
        return plus;
    }
         
    public static Heladera getInstance(){
        Heladera e = new Heladera();
        
        e.precioBase=Teclado.leerDouble ("Precio Base: ",1.00,250000.0);
        e.color=Teclado.leerTexto("Color: ");
        e.consumoEnergetico=Teclado.leerChar("Consumo: ","ABCDEF");
        e.peso=Teclado.leerDouble("Peso: ", 1, 1000);
        e.codigo=Teclado.leerInt("codigo: ");
        e.nombre=Teclado.leerTexto("nombre: ");
        e.capacidad=Teclado.leerInt("Capacidad: ",150,600);
        
        return e;
    }
}

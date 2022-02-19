package javaapplication262electrodomesticos;

public class Lavadora extends Electrodomestico
{
    //Constantes
  
    private final static int CARGA_DEF=5;
  
    //Atributos
  
    private int carga;
  
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, 
                CODIGO_DEF,NOMBRE_DISPONIBLES[1],CARGA_DEF);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF,
                COLOR_DEF, CODIGO_DEF,NOMBRE_DEF, CARGA_DEF);
    }
  
    
    public Lavadora(double precioBase, double peso, char consumoEnergetico,
            String color, int codigo, String nombre,int carga){
        super(precioBase,peso, consumoEnergetico,color, codigo,nombre);
        this.carga=carga;
    }    
    
    public Lavadora(String sLosAtt){
        String[]sep = sLosAtt.split(",");
        
        precioBase =Double.parseDouble(sep[0]);
        peso       =Double.parseDouble(sep[1]);
        consumoEnergetico =comprobarConsumoEnergetico(sep[2].charAt(0));
        color=comprobarColor(sep[3]);
        codigo=Integer.parseInt(sep[4]);
        nombre=comprobarNombre(sep[5]);
        carga=Integer.parseInt(sep[6]);
    }    

    @Override
    public String toString() {
        return  super.toString() + "," + carga;
    }
    
    public void mostrar(){ 
       
                System.out.println
        (
                   "\nLavadora" 
                 + "\nPrecio Base: " + getPrecioBase() 
                 + "\nnombre: " + getNombre ()
                 + "\ncodigo: " + getCodigo()
                 + "\nColor: " + getColor() 
                 + "\nConsumo Energetico: " + getConsumoEnergetico() 
                 + "\nPeso: " + getPeso() 
                 + "\nCarga: " + carga
                 + "\nPrecio Final: " + precioFinal()
        );

    }
    
    public int getCarga() {
        return carga;
    }


    
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }

    public static Lavadora getInstance()
    {
        Lavadora e = new Lavadora();
        
        e.precioBase=Teclado.leerDouble ("Precio Base: ",1.00,250000.0);
        e.color=Teclado.leerTexto("Color: ");
        e.consumoEnergetico=Teclado.leerChar("Consumo: ","ABCDEF");
        e.peso=Teclado.leerDouble("Peso: ", 1, 1000);
        e.codigo=Teclado.leerInt("codigo: ");
        e.nombre=Teclado.leerTexto("nombre: ");
        e.carga=Teclado.leerInt("Carga: ",5,60);
        return e;
    }

}
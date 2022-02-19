package javaapplication262electrodomesticos;

public abstract class Electrodomestico{ 
   
    //ATRIBUTOS DE CLASE (CONSTANTES)
    public final static String COLORES_DISPONIBLES[]
            ={"blanco", "negro", "rojo", "azul", "gris"};
    public final static String  COLOR_DEF = COLORES_DISPONIBLES[0];
    public final static char    CONSUMO_ENERGETICO_DEF = 'F';
    public final static double  PRECIO_BASE_DEF=1000;
    public final static double  PESO_DEF=5;
    public final static int CODIGO_DEF = 2020;
    public final static String NOMBRE_DISPONIBLES[] 
            ={"Electrodomestico","lavadora","heladera","television"};   
    public final static String NOMBRE_DEF = NOMBRE_DISPONIBLES[0];
   
    //ATRIBUTOS DE INSTANCIA
    protected double precioBase;
    protected String color;
    protected char   consumoEnergetico;
    protected double peso;
    protected int    codigo;
    protected String nombre;
    
   
    //CONSTRUCTORES:
    public Electrodomestico()
    {//CONSTRUCTOR POR DEFECTO  
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF,
                CODIGO_DEF,NOMBRE_DEF);
    }
   
    
    public Electrodomestico(double precioBase, double peso)
    {//CONSTRUCTOR CON PARAMETROS
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF,
                CODIGO_DEF,NOMBRE_DEF);
    }
   
    
    public Electrodomestico(double precioBase, double peso, 
            char consumoEnergetico, String color, int codigo, String nombre)
    {//CONSTRUCTOR CON PARAMETROS
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
        this.color=comprobarColor(color);
        this.codigo=codigo;
        this.nombre=nombre;
    }
   
    //{["12500.23"],["115.20"],["F"],["Rojo"]  4    } = "12500.23,115.20,F,Rojo".split(",")
    //       0          1        2       3   length
    public Electrodomestico(String losAtributosSeparadosPorComa)
    {
        String []separados = losAtributosSeparadosPorComa.split(",");
        this.precioBase        = Double.parseDouble(separados[0]);
        this.peso              = Double.parseDouble(separados[1]);
        this.consumoEnergetico = comprobarConsumoEnergetico(separados[2].charAt(0));
        this.color             = comprobarColor(separados[3]);
        this.codigo            = Integer.parseInt(separados[4]);
        this.nombre            = comprobarNombre(separados [5]);
    }

    @Override
    public String toString()
    {
        return  precioBase + "," + peso + "," + consumoEnergetico + "," +
                color + "," + codigo + "," + nombre;
    }

    
    public void mostrar()
    {
        System.out.println
        (
                   "\nElectrodomestico" 
                 + "\nnombre: " + nombre
                 + "\ncodigo: " + codigo
                 + "\nPrecio Base: " + precioBase 
                 + "\nColor: " + color 
                 + "\nConsumo Energetico: " + consumoEnergetico 
                 + "\nPeso: " + peso 
                 + "\nPrecio Final: " + precioFinal()
                
        );
    }
    
    
   public double precioFinal()
    {   
        return precioBase + importePorConsumo() + importePorPeso();
    }
    
    //METODOS PRIVADOS
    protected String comprobarColor(String color)
    {
        for (int i = 0; i < COLORES_DISPONIBLES.length; i++)
        {
            if (color.equals(COLORES_DISPONIBLES[i]))
            {
                return color;
            }
        }
        return COLOR_DEF;
    } 
    protected String comprobarNombre (String nombre)
    {
        for (int i = 0; i < NOMBRE_DISPONIBLES.length; i++) {
            if(nombre.equals(NOMBRE_DISPONIBLES[i])){
                return nombre;
            }
        } return NOMBRE_DEF;
    }
  
    protected char comprobarConsumoEnergetico(char consumoEnergetico)
    {   
        return (consumoEnergetico>='A' 
            && consumoEnergetico<='F')?consumoEnergetico:CONSUMO_ENERGETICO_DEF;
    }
   
    private double importePorPeso(){
        double precio=0;
        
         
        if(peso>=0 && peso<19){
            precio+=10;
        }else{
            if(peso<=49){
                precio+=50;
            }else{
                if(peso<=79){
                    precio+=80;
                }else{ 
                    
                    precio+=100;
                }
            }
        }
        return precio;
    }

    private double importePorConsumo()
    {
        double precio=0;
        
        switch(consumoEnergetico)
        {
            case 'A':  precio+=100; break;
            case 'B':  precio+=80;  break;
            case 'C':  precio+=60;  break;
            case 'D':  precio+=50;  break;
            case 'E':  precio+=30;  break;
            case 'F':  precio+=10;  break;
        }
        return precio;
    }

   

    //METODOS PUBLICOS
    public int getCodigo()
    {
        return codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
    public void setPrecioBase(double precioBase)
    {
        this.precioBase = precioBase;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico)
    {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    
    public double getPrecioBase() 
    {
        return precioBase;
    }
    
    public String getColor() 
    {
        return color;
    }
     
    public char getConsumoEnergetico() 
    {
        return consumoEnergetico;
    }
   
    public double getPeso()
    {
        return peso;
    }
}

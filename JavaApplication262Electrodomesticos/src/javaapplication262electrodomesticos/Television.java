package javaapplication262electrodomesticos;

public final class Television extends Electrodomestico {

    private final static int RESOLUCION_DEF = 20;

    private int resolucion;

    private boolean sintonizadorTDT;

    public double precioFinal() {
        //Invocamos el método precioFinal del método padre
        double plus = super.precioFinal();

        //Añadimos el codigo necesario
        if (resolucion > 40) {
            plus += getPrecioBase() * 0.3;
        }
        if (sintonizadorTDT) {
            plus += 50;
        }

        return plus;
    }

    @Override
    public String toString() {
        return super.toString() + "," +resolucion+","+sintonizadorTDT;
    }

    public Television() {
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF,
                CODIGO_DEF, NOMBRE_DISPONIBLES[3], RESOLUCION_DEF, false);
    }

    public Television(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CODIGO_DEF,
                NOMBRE_DEF, RESOLUCION_DEF, false);
    }

    public Television(double precioBase, double peso, char consumoEnergetico,
            String color, int codigo, String nombre, int resolucion,
            boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color, codigo, nombre);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(String sLosAtt) {
        String[] sep = sLosAtt.split(",");

        this.setPrecioBase(Double.parseDouble(sep[0]));
        this.setPeso(Double.parseDouble(sep[1]));
        this.setConsumoEnergetico(comprobarConsumoEnergetico(sep[2].charAt(0)));
        this.setColor(comprobarColor(sep[3]));
        this.setCodigo(Integer.parseInt(sep[4]));
        this.setNombre(comprobarNombre(sep[5]));
        this.resolucion = Integer.parseInt(sep[6]);
        this.sintonizadorTDT = Boolean.getBoolean(sep[7]);
    }

    public static Television getInstance() {
        Television e = new Television();

        e.precioBase = Teclado.leerDouble("Precio Base: ", 1.00, 250000.0);
        e.color = Teclado.leerTexto("Color: ");
        e.consumoEnergetico = Teclado.leerChar("Consumo: ", "ABCDEF");
        e.peso = Teclado.leerDouble("Peso: ", 1, 1000);
        e.codigo = Teclado.leerInt("codigo: ");
        e.nombre = Teclado.leerTexto("nombre: ");
        e.resolucion = Teclado.leerInt("Capacidad: ", 20, 40);
        //resolver una situacion en una sola linea
        e.sintonizadorTDT = (Teclado.leerChar("tiene sintonizador: ", "SN")
                =='S')? true : false;

        return e;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
}

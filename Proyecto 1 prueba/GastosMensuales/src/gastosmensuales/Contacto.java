package gastosmensuales;



public class Contacto{

    private int id;
    private String tipoDeGasto;
    private String empresa;
    private String fecha;
    private double monto;
    
    public Contacto() {
    }

    public static Contacto getContactoRandom() {
        Contacto c = new Contacto();
        c.id = intRand(10000,20000);
     
        c.tipoDeGasto = tipoDeGastoRandom();
        c.empresa = empresaRandom();
        c.monto = montoRandom(0.00, 10000000.00);
        c.fecha = fechaRandom();

        return c;
    }

    public Contacto(int id, String tipoDeGasto, String empresa, String fecha,
            double monto) {
        this.id = id;
        this.tipoDeGasto = tipoDeGasto;
        this.empresa = empresa;
        this.fecha = fecha;
        this.monto = monto;
       
    }

    public Contacto(String losAtributos) {
        String[] separados = losAtributos.split(",");
        this.id = Integer.valueOf(separados[0]);
        this.tipoDeGasto = separados[1];
        this.empresa = separados[2];
        this.fecha = separados[3];
        this.monto = Teclado.leerDouble (separados[4]);
        
    }

    public static Contacto getInstance() {
        Contacto c = new Contacto();

        c.id = Teclado.leerInt("ID (10000..20000): ", 10000, 200000);
        c.empresa = Teclado.leerTexto("Empresa: ");
        c.tipoDeGasto= Teclado.leerTexto("Tipo de Gasto: ");
        
        c.fecha = Teclado.leerTexto("Fecha: ");
        c.monto = Teclado.leerDouble("Monto: ");
        return c;
    }

    private static String tipoDeGastoRandom() {
        String s = "" + letraRandom('A', 'Z');
        int cantidad = intRand(7, 20);

        for (int i = 0; i < cantidad; i++) {

            s += letraRandom('a', 'z');
        }

        return s;
    }
    
        private static String empresaRandom() {
        String s = "" + letraRandom('A', 'Z');
        int cantidad = intRand(7, 20);

        for (int i = 0; i < cantidad; i++) {

            s += letraRandom('a', 'z');
        }

        return s;
    }

    private static String fechaRandom() {
        String s = "";
        int cantidad = 8;

        for (int i = 0; i < cantidad; i++) {
            s += intRand('0', '9');
        }

        return s;
    }

    private static double montoRandom(double d, double h) {
        
        return (double) (Math.random() * (h - d + 1) + d);
        
    }

    @Override
    public String toString() {
        return  id +  "\t" +  tipoDeGasto +  "\t" +  empresa +  "\t" +  fecha + "\t" + monto ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeGasto() {
        return tipoDeGasto;
    }

    public void setTipoDeGasto(String tipoDeGasto) {
        this.tipoDeGasto = tipoDeGasto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombres(String nombres) {
        this.empresa = nombres;
    }

    public String getFecha () {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    

    private static int intRand(int d, int h) {
        return (int) (Math.random() * (h - d + 1) + d);
    }

    private static char letraRandom(char d, char h) {
        return (char) (Math.random() * (h - d + 1) + d);
    }

    public void mostrar() {
        System.out.println("Contacto:\n" +
                "id: "+id+"\n"+
                "Nombre: "+tipoDeGasto+", "+empresa+
                "Telefono: "+fecha+"\n"+
                "Mail: "+monto+"\n");
    }

}

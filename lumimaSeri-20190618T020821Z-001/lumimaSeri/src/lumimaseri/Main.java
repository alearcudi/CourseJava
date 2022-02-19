package lumimaseri;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\ITMaster\\Desktop\\dracula.txt";
        Lispal lp = new Lispal();
        lp.llenar(nombreArchivo);
        lp.mostrar();
    }
    
}

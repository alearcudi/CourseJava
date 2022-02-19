package archivosypalabras;

public class Alumno {

    private static int enteroRandom(int d, int h) {
        return (int)(Math.random() * (h-d+1)+d);
    }
    private int legajo;
    private int nota;

    public Alumno() {
    }

    public Alumno(int legajo, int nota) {
        this.legajo = legajo;
        this.nota = nota;
    }
    //sLosAtributos ==> "123432,8"
    //separados ==> {["123432"]["8"]}
    //                    0      1
    public Alumno(String sLosAtributos) {
        String []separados = sLosAtributos.split(",");
        legajo = Integer.parseInt(separados[0]);
        nota = Integer.parseInt(separados[1]);
    }

    @Override
    public String toString() {
        return   legajo + "," + nota;
    }

   public static Alumno getInstance(){
       Alumno x = new Alumno();
       
       x.legajo = enteroRandom(10000,99999);
       x.nota = enteroRandom(1, 10);
       return x;
   }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
            
    
}

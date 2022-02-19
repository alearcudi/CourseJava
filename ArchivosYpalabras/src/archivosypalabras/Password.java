package archivosypalabras;
public class Password {
    
    private static final int LONGITUD = 8;
    
    private int longitud;
    private String contrasenia;

    public Password() {
        this(LONGITUD);
    }

    
    public Password(String password) {
        String [] separados = password.split(",");
        
        this.contrasenia = separados[0];
        this.longitud = Integer.parseInt(separados[1]);
    }
    
    public Password(int longitud) {
        this.longitud = (longitud<LONGITUD)?LONGITUD:longitud;
        contrasenia = generarPassword();
    }

    @Override
    public String toString() {
        return  contrasenia+","+longitud ;
    }
    
    
    
    public String getContrasenia() {
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    private String generarPassword() {
        String s="";
        
        do{//HACER
            s="";
            for(int i=0;i < longitud;i++){
                
                int n = enteroRandom(1,100);
                if (n<9) {//MINUCULA 10%
                    s = s + letraMinuscula();
                }
                else{
                    if (n<15) {//MAYUSCULAS 20%
                        s = s + letraMayuscula();
                    }
                    else{
                        s = s + digito();
                    }
                }
            }
        }while(! esFuerte(s));//MIENTRAS ERROR
        
        
        return s;
        
    }

    private boolean esFuerte(String s) {
        int contdorMinusculas=0;
        int contdorMayusculas=0;
        int contdorDigitos=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
              contdorMinusculas++;  
            }
            else{
                if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                    contdorMayusculas++;
                }
                else{
                    contdorDigitos++;
                }
 
            }
        }
        return contdorMayusculas>=2&&
                contdorMinusculas>=1&&
                 contdorDigitos>=5;
    }

    private int enteroRandom(int d, int h) {
        return (int)(Math.random()*(h-d+1)+d);
    }

    private char letraMinuscula() {
        return (char)enteroRandom('a','z');
    }

    private char letraMayuscula() {
        return (char)enteroRandom('A','Z');
    }

    private char digito() {
        return (char)enteroRandom('0','9');
    }
    
    
    
    
}

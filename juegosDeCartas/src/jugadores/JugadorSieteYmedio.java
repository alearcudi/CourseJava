package jugadores;

import cartas.Carta;
import mazos.MazoEspaniol;

public abstract class JugadorSieteYmedio extends JugadorCartas implements Plantable {

    public JugadorSieteYmedio(String nombre) {
        super(nombre);
        mano = new MazoEspaniol();

    }

    public int cantidadCartas() {
        return mano.tamanio();
    }

    public void tomaCarta(Carta c) {
        mano.set(c);
    }

    public int laSumaDeLasCartas() {
        int suma = 0;
        double sumaD = 0;
        int cantidadDiez = 0;
        int cantidadOnce = 0;
        int cantidadDoce = 0;
        for (int i = 0; i < mano.tamanio(); i++) {

            Carta c = mano.ver(i);
            if (c.getNumero() == 10) {
                cantidadDiez++;
            } //else{
            if (c.getNumero() == 11) {
                cantidadOnce++;
            }

            if (c.getNumero() == 12) {
                cantidadDoce++;
            } else {
                suma += c.getNumero();
            }
        }

//return suma;
        while (cantidadDiez > 0 && (suma + 1) >= 7) {
            sumaD = suma + 0.5;
            cantidadDiez--;
            while (cantidadOnce > 0 && (suma + 1) >= 7) {
                sumaD = suma + 0.5;
                cantidadOnce--;
                while (cantidadDoce > 0 && (suma + 1) >= 7) {
                    sumaD = suma + 0.5;
                    cantidadDoce--;
                }
//        sumaD=suma+cantidadDiez;
//        sumaD=suma+cantidadOnce;
//        sumaD=suma+cantidadDoce;
//        return suma;

            }
        
        }sumaD = suma + cantidadDiez;
        sumaD = suma + cantidadOnce;
        sumaD = suma + cantidadDoce;
        return suma;

    
}
}
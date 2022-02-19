package mazos;

import cartas.Carta;
import cartas.CartaEspaniola;

public class MazoEspaniol extends Mazo {

    public MazoEspaniol() {
        super();
    }

    @Override
    public void llenar() {
        for (int mazo = 1; mazo <= 10; mazo++) {
            for (int numero = 1; numero <= 12; numero++) {
                for (int palo = 1; palo <= 4; palo++) {
                    lasCartas.add(new CartaEspaniola(numero, palo));
                    
                }
            }

        }

    }

}
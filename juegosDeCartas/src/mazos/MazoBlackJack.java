package mazos;

import cartas.Carta;
import cartas.CartaPoker;

public final class MazoBlackJack extends Mazo{

    public MazoBlackJack() {
        super();
    }

    @Override
    public void llenar() {
        for (int mazo = 1; mazo <= 10; mazo++) {
            for (int numero = 1; numero <= 13; numero++) {
                for (int palo = 1; palo <= 4; palo++) {
                    lasCartas.add(new CartaPoker(numero, palo));
                }
            }
        }
    }
    
    
}

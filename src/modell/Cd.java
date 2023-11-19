package modell;

import java.util.Random;

/**
 *
 * @author csaladi.alexandra
 */
public class Cd extends Mediaanyag{
    private int karcolodas;
    private boolean eltort;

    public Cd(String kolcsNeve, boolean kolcsonozve) {
        super(kolcsNeve, kolcsonozve);
        karcolodas = 0;
        eltort = false;
    }

    @Override
    public void altalanosHasznalatHatasa() {
        karcolodas *= .98;
    }

    @Override
    public void NemVartEsemeny() {
        Random rnd = new Random();
        eltort = rnd.nextBoolean();
    }
    
}

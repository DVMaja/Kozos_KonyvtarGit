package modell;

import java.util.Random;

/**
 *
 * @author csaladi.alexandra
 */
public class Dvd extends Mediaanyag{
    private int karcolodas;
    private boolean eltort;

    public Dvd(String kolcsNeve) {
        super(kolcsNeve);
        karcolodas = 0;
        eltort = false;
    }
    
    @Override
    public void altalanosHasznalatHatasa() {
        karcolodas *= .87;
    }

    @Override
    public void NemVartEsemeny() {
        Random rnd = new Random();
        eltort = rnd.nextBoolean();
    }
}

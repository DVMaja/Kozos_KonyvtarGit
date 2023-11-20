package modell;

import java.util.Random;

/**
 *
 * @author csaladi.alexandra
 */
public class Konyv extends Mediaanyag{
    private int gyurodes;
    private boolean szakadt;

    public Konyv(String kolcsNeve) {
        super(kolcsNeve);
        gyurodes = 0;
        szakadt = false;
    }
    
    @Override
    public void altalanosHasznalatHatasa() {
        gyurodes *= .98;
    }

    @Override
    public void NemVartEsemeny() {
        Random rnd = new Random();
        szakadt = rnd.nextBoolean();
    }
}

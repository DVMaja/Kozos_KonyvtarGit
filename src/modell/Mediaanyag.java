package modell;

/**
 *
 * @author csaladi.alexandra
 */
public abstract class Mediaanyag {
    private String kolcsNeve;
    private boolean kolcsonozve;

    public Mediaanyag(String kolcsNeve) {
        this.kolcsNeve = kolcsNeve;
        kolcsonozve = false;
    }

    public String getKolcsNeve() {
        return kolcsNeve;
    }

    public boolean isKolcsonozve() {
        return kolcsonozve;
    }

    public void setKolcsNeve(String kolcsNeve) {
        this.kolcsNeve = kolcsNeve;
    }

    public void setKolcsonozve(boolean kolcsonozve) {
        this.kolcsonozve = kolcsonozve;
    }

    @Override
    public String toString() {
        return "Mediaanyag{" + "kolcsNeve=" + kolcsNeve + ", kolcsonozve=" + kolcsonozve + '}';
    }
    
    public abstract void altalanosHasznalatHatasa(); //a könyv gyűrődhet, a lemez karcolódhat
    public abstract void NemVartEsemeny(); //töres, szakadas
}

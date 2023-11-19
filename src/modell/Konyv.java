package modell;

/**
 *
 * @author csaladi.alexandra
 */
public class Konyv extends Mediaanyag{
    private String kolcsNeve;
    private boolean kolcsonozve;

    public Konyv(String kolcsNeve) {
        this.kolcsNeve = kolcsNeve;
        kolcsonozve = false;
    }

    public String getKolcsNeve() {
        return kolcsNeve;
    }

    public void setKolcsNeve(String kolcsNeve) {
        this.kolcsNeve = kolcsNeve;
    }

    public boolean isKolcsonozve() {
        return kolcsonozve;
    }

    public void setKolcsonozve(boolean kolcsonozve) {
        this.kolcsonozve = kolcsonozve;
    }

    @Override
    public String toString() {
        return "Konyv{" + "kolcsNeve=" + kolcsNeve + ", kolcsonozve=" + kolcsonozve + '}';
    }
}

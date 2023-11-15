package modell;

public class Konyv {

    private String kolcsonzoNeve;
    private boolean kolcsonozve;

    public Konyv(String kolcsonzoNeve) {
        this.kolcsonzoNeve = kolcsonzoNeve;
        kolcsonozve = false;
    }

    public boolean kiKolcsonozve() {
        return kolcsonozve;
    }

    public void kiKolcsonozve(boolean kolcsonozve) {
        this.kolcsonozve = kolcsonozve;
    }

    @Override
    public String toString() {
        return "Konyv{" + "kolcsonzoNeve=" + kolcsonzoNeve + ", kolcsonozve=" + kolcsonozve + '}';
    }

}

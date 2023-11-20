package modell;

public class Konyv extends Mediaanyag{

    private double allapot;

    public Konyv(String tulNev) {
        super(tulNev);
        allapot = 100; //mindig 0.5% romlik
    }

//    public Konyv(String kolcsonzoNeve) {
//        this.kolcsonzoNeve = kolcsonzoNeve;
//        kolcsonozve = false;
//    }

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

    @Override
    public void hasznalat() {
        allapot *= .950;
    }

}

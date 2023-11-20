package modell;

public class Konyv extends Mediaanyag{

    private double allapot;

    public Konyv(String kolcsonzoNeve) {
        super(kolcsonzoNeve);
        allapot = 100; //mindig 0.5% romlik
    }

//    public Konyv(String kolcsonzoNeve) {
//        this.kolcsonzoNeve = kolcsonzoNeve;
//        kolcsonozve = false;
//    }
//
//    public boolean kiKolcsonozve() {
//        return kolcsonozve;
//    }
//
//    public void kiKolcsonozve(boolean kolcsonozve) {
//        this.kolcsonozve = kolcsonozve;
//    }

    @Override
    public String toString() {
        String kimenoSz = super.toString();
        return kimenoSz + System.lineSeparator() + "\t"
                + "Könyv{" + "használtság=" + allapot + '}';
    }

    @Override
    public void hasznalat() {
        allapot *= .950;
    }

    @Override
    public void tonkrement() {
    }

}

package modell;

public class Konyvtar {

    private int mediaDb;
    private Konyv[] konyvek;

    public Konyvtar() {
        this(5);
    }

    public Konyvtar(int db) {
        mediaDb = 0;
        konyvek = new Konyv[db];
    }

    public void kolcsonoz(Konyv konyv) {
        if (mediaDb < konyvek.length) {
            konyvek[mediaDb++] = konyv;
        } else {
            System.out.println("Nem lehet több könyvet kölcsönözni!");
        }
    }

    public void kiad(String kolcsonzoNeve) {

        int i = 0;
        while (konyvek[i] == null || i < mediaDb && !(konyvek[i].getKollNev().equals(kolcsonzoNeve))) {
            i++;
        }
        if (i < mediaDb) {
            String tipus = konyvek[i] instanceof Konyv ? "Könyv" : "CD";
            System.out.println("Kiadva %s %s!".formatted(kolcsonzoNeve, tipus));

            konyvek[i] = null;
        }

    }

    public Konyv[] getKonyv() {
        Konyv[] kolcsonzottKonyv = new Konyv[this.konyvek.length];
        for (int i = 0; i < mediaDb; i++) {
            Konyv aktualisKonyv = this.konyvek[i];
            if (aktualisKonyv != null) {
                kolcsonzottKonyv[i] = aktualisKonyv;
            }
        }
        return kolcsonzottKonyv;

    }

}

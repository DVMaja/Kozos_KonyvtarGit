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

    public void hasznalat() {
        //itt fog romlani a köny Cd DVD állapota
        // szakadás, törés, stb lásd a readme-be

    }
}

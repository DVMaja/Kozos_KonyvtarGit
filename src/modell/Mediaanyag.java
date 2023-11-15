package modell;

public class Mediaanyag {

    private int mediaDb;
    private Konyv[] konyvek;

    public Mediaanyag() {
        this(5);
    }

    public Mediaanyag(int db) {
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
    
    public void hasznalat(){
        //itt fog romlani a köny Cd DVD állapota
        // szakadás, törés, stb lásd a readme-be
        
        }

}

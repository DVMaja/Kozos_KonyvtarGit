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
    
    
}

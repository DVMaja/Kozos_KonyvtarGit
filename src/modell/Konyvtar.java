package modell;

public class Konyvtar {
    private Mediaanyag[] mediaanyag;
    private int mediaDb;
    
    public Konyvtar() {
        this(5);
    }

    public Konyvtar(int mediaDb) {
        mediaDb = 0;
        mediaanyag = new Mediaanyag[mediaDb];
    }
    
    //Át a könyvtárba
    public void kolcsonoz(Mediaanyag media){
        if (mediaDb < mediaanyag.length) {
            mediaanyag[mediaDb++] = media;
        } else {
            System.out.println("Már kivett 5 könyvet, nem vehet ki többet!");
        }
    }
    
    //használat
    
    public String[] getKonyv(){
        String[] mediak = new String[this.mediaanyag.length];
        return mediak;
    }
}

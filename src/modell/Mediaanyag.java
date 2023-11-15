package modell;

/**
 *
 * @author csaladi.alexandra
 */
public class Mediaanyag {
    private Mediaanyag[] mediaanyag;
    private int mediaDb;

    public Mediaanyag() {
        this(5);
    }

    public Mediaanyag(int mediaDb) {
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
    
    public String[] getMediaanyag(){
        String[] mediak = new String[this.mediaanyag.length];
        return mediak;
    }
    
    
    
}

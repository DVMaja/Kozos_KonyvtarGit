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
    public void kolcsonoz(Mediaanyag media) {
        if (mediaDb < mediaanyag.length) {
            mediaanyag[mediaDb++] = media;
        } else {
            System.out.println("Már kivett 5 könyvet, nem vehet ki többet!");
        }
    }

    //használat
    public void altalanosHasznalat() {
        for (Mediaanyag media : mediaanyag) {
            if (media != null) {
                media.setKolcsonozve(true);
                media.altalanosHasznalatHatasa();
            }
        }
    }

    public void nemVartEs() {
        for (Mediaanyag media : mediaanyag) {
            if (media != null) {
                media.setKolcsonozve(true);
                media.NemVartEsemeny();
            }
        }
    }

    public Mediaanyag[] getMedia() {
        Mediaanyag[] kiadottMediak = new Mediaanyag[this.mediaanyag.length];
        for (int i = 0; i < mediaDb; i++) {
            Mediaanyag aktualisMedia = this.mediaanyag[i];
            if (aktualisMedia != null) {
                kiadottMediak[i] = aktualisMedia;
            }
        }
        return kiadottMediak;
    }
}

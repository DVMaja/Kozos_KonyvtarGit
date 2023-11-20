package main;

import modell.Konyv;
import modell.Konyvtar;
import modell.Mediaanyag;

public class KonyvtarProgram {

    private Konyvtar konyvtar;

    public static void main(String[] args) {
        new KonyvtarProgram();
    }

    public KonyvtarProgram() {
        konyvtar = new Konyvtar(2);
        konyvtar.kolcsonoz(new Konyv("Zsuzsa"));
        konyvtar.kolcsonoz(new Konyv("Peti"));
        
        System.out.println("--- könyvtár könyvei kölcsönzés előtt:");
        konyvtarKonyvei();
        
    }

    private void konyvtarKonyvei() {
        for (Mediaanyag mediaanyag : konyvtar.getMedia()) {
            if (mediaanyag != null) {
                System.out.println(mediaanyag);
            }
        }
    }
}

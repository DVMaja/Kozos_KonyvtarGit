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
        //ide kerülnek a feladatok
        konyvtar = new Konyvtar();        
        konyvtar.kolcsonoz(new Konyv("Nagy Mariska"));
        konyvtar.kolcsonoz(new Konyv("Kis Tibor"));
        konyvtar.kolcsonoz(new Konyv("Nagy Pista"));
        konyvtar.kolcsonoz(new Konyv("Kis Tímea"));
        
        System.out.println("Könyvek kikölcsönözve");
       
        KonyvtariMediak();
        
    }
    
    private void KonyvtariMediak() {
        for (Mediaanyag mediaanyag : konyvtar.getKonyv()) {
            if(mediaanyag != null){
                System.out.println(mediaanyag);
            }
        }
    }
}

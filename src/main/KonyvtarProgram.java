package main;

import modell.Konyv;
import modell.Konyvtar;

public class KonyvtarProgram {
    
    private Konyvtar konyvtar;

    public static void main(String[] args) {
        new KonyvtarProgram();
    }
    
    public KonyvtarProgram(){
        konyvtar = new Konyvtar(5);
        konyvtar.kolcsonoz(new Konyv("Zsuzsa"));
        
        //Peti csak két könyvet visz el, még 3-at kikölcsönözhet
        konyvtar = new Konyvtar(2);
        konyvtar.kolcsonoz(new Konyv("Peti"));
        
        
    }
    
}

package modell;

public class Konyvtar {
     private Konyv[] konyv;
    private int konyvDb;
    
    public Konyvtar() {
        this(5);
    }

    public Konyvtar(int mediaDb) {
        mediaDb = 0;
        konyv = new Konyv[konyvDb];
    }
    
    //Át a könyvtárba
    public void kolcsonoz(Konyv konyvet){
        if (konyvDb < konyv.length) {
            konyv[konyvDb++] = konyvet;
        } else {
            System.out.println("Már kivett 5 könyvet, nem vehet ki többet!");
        }
    }
    
    //használat
    
    public String[] getKonyv(){
        String[] konyvek = new String[this.konyv.length];
        return konyvek;
    }
}

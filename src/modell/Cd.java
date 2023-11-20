package modell;

public class Cd extends Mediaanyag{
    //Cd rom
   private double karSzazalek;

    public Cd(String tulNev) {
        super(tulNev);
        karSzazalek = 100;
    }

    @Override
    public void hasznalat() {
        karSzazalek *= .05;
    }

    @Override
    public void tonkrement() {
    }
    
}

package modell;

public abstract class Mediaanyag {
    private String kolcsonzoNeve;
    private boolean kiadva;

    public Mediaanyag(String tulNev) {
        this.kolcsonzoNeve = tulNev;
        kiadva = false;
    }

    public String getKollNev() {
        return kolcsonzoNeve;
    }

    public void setKolNev(String tulNeve) {
        this.kolcsonzoNeve = tulNeve;
    }

    public boolean kiadva() {
        return kiadva;
    }

    public void setKiadva(boolean kiadva) {
        this.kiadva = kiadva;
    }

    @Override
    public String toString() {
        return "Ruha{" + "kolcsonzoNeve=" + kolcsonzoNeve + ", kiadva=" + kiadva + '}';
    }
    
    public abstract void hasznalat();
    

}

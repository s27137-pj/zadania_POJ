package zad5_4;

public class KsiazkaPapierowa extends Ksiazka {
    int rokWydania;

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania){
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}

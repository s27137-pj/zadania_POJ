package zad5_4;

public class Ebook extends Ksiazka{

    int rozmiar;
    String format;

    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format){
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}

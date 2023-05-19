package zad5_4;

public class Ksiazka {

    String tytul;
    String autor;
    int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }


    public int getLiczbaStron() {
        return liczbaStron;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}

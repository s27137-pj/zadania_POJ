package zad5_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Ebook> ebooki = new ArrayList<>();
        ebooki.add(new Ebook("Anioły i Demony", "Dan Brown", 555, 20, "PDF"));
        ebooki.add(new Ebook("Lśnienie", "Stephen King", 400, 15, "PDF"));
        ebooki.add(new Ebook("Inferno", "Dan Brown", 600, 30, "PDF"));

        List<KsiazkaPapierowa> ksiazki = new ArrayList<>();
        ksiazki.add(new KsiazkaPapierowa("Pierwszy śnieg", "Jo Nesbo", 350, 2007));
        ksiazki.add(new KsiazkaPapierowa("Nie mów nikomu", "Harlan Coban", 220, 2001));
        ksiazki.add(new KsiazkaPapierowa("Księżniczka z lodu", "Camilla Lackberg", 290, 2003));

        ebooki.sort((e1, e2) -> e1.getTytul().compareTo(e2.getTytul()));

        for (Ebook ebook : ebooki) {
            System.out.println(ebook.getTytul());
        }
        System.out.println();

        ksiazki.sort((e1, e2) -> e1.getTytul().compareTo(e2.getTytul()));

        for (KsiazkaPapierowa ksiazkaPapierowa : ksiazki) {
            System.out.println(ksiazkaPapierowa.getTytul());
        }

    }

}


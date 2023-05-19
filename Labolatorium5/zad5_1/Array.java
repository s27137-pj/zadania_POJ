package zad5_1;
import java.util.*;

public class Array{
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ArrayList<Integer> tablica = new ArrayList<>(50);

        for (int i = 0; i < 50; i++) {
            tablica.add(i * 2);
        }

        for (int i = 0; i < tablica.size(); i++) {
            System.out.println("Liczba " + tablica.get(i) + " jest pod indeksem " + i);
        }

        long stop = System.currentTimeMillis();

        long czas = stop - start;

        System.out.println("Czas wykonania operacji wynosi: " + czas + "ms");

        }







    }



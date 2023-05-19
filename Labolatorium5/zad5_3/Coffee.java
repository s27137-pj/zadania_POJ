package zad5_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {

        ArrayList<String> kawa = new ArrayList<>();

        kawa.add("espresso");
        kawa.add("latte");
        kawa.add("cappuccino");
        kawa.add("mocha");
        kawa.add("auLait");
        kawa.add("macchiato");

        System.out.println(kawa);

        Iterator<String> it = kawa.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for (String k : kawa) {
            System.out.println(k.toUpperCase());
        }

        for (String k : kawa) {
            for (int i = 0; i < 4; i++) {

                System.out.print(k.charAt(i));
            }
            System.out.println();
            }
        }
    }

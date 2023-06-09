package zad6_2;
import java.util.LinkedList;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args){
        HashSet<String> rasyPsow = new HashSet<>();


        rasyPsow.add("Doberman");
        rasyPsow.add("Samoyed");
        rasyPsow.add("York");
        rasyPsow.add("Lablador");
        rasyPsow.add("Buldog");


        System.out.println("Zawartość zbioru Hash:");


        System.out.println(rasyPsow);



        String[] array = rasyPsow.toArray(new String[0]);


        System.out.println("Zawartość tablicy:");

        System.out.println(rasyPsow);
    }
            }

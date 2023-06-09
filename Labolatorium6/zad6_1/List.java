package zad6_1;
import java.util.LinkedList;


public class List {
    public static void main(String[] args){
        LinkedList<String> rasyPsow = new LinkedList<>();


        rasyPsow.add("Doberman");
        rasyPsow.add("Samoyed");
        rasyPsow.add("York");
        rasyPsow.add("Lablador");
        rasyPsow.add("Buldog");


        System.out.println("The oryginal linked list: ");
        System.out.println(rasyPsow);


        String pierwszyElement = rasyPsow.removeFirst();
        String ostatniElement = rasyPsow.removeLast();



        System.out.println("Element removed: " + pierwszyElement + ", " + ostatniElement);


        System.out.println("The new linked list: ");
        System.out.println(rasyPsow);
    }
}
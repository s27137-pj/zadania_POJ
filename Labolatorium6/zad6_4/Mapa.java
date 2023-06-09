package zad6_4;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> mies = new HashMap<>();
        mies.put(1, "Styczeń");
        mies.put(2, "Luty");
        mies.put(3, "Marzec");
        mies.put(4, "Kwiecień");
        mies.put(5, "Maj");
        mies.put(6, "Czerwiec");
        mies.put(7, "Lipiec");
        mies.put(8, "Sierpień");
        mies.put(9, "Wrzesień");
        mies.put(10, "Październik");
        mies.put(11, "Listopad");
        mies.put(12, "Grudzień");

        Scanner scanner = new Scanner(System.in);
        int miesiac = 0;

        try {
            System.out.print("Podaj numer miesiąca od 1 do 12: ");
            miesiac = scanner.nextInt();

            if (miesiac >= 1 && miesiac <= 12) {
                String numer = mies.get(miesiac);
                System.out.println("Miesiąc o numerze " + miesiac + " to " + numer);
            } else {
                System.out.println("Podano nieprawidłowy numer miesiąca.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Podano nieprawidłowy typ danych.");
        }
        System.out.println("Wszystkie miesiące to: " + mies);
    }
}

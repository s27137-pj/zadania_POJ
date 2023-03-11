import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


//        zadanie_01();
//        zadanie_02();
//        zadanie_03();
//        zadanie_04();
//        zadanie_05();
//        zadanie_06();
//        zadanie_07();
//        zadanie_08();
//        zadanie_09();
//        zadanie_10();
//        zadanie_11();
//        zadanie_12();
//        zadanie_13();
        zadanie_14();


    }

    public static void zadanie_01() {

        System.out.println("Zadanie_01: ");
        System.out.println("Wprowadź wartość a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Wprowadź wartość b: ");
        int b = scanner.nextInt();

        System.out.println((double) a * b);
    }

    public static void zadanie_02() {
        System.out.println("Zadanie_02: ");
//        System.out.println(Math.PI);
        double b = Math.PI;
        double a = Math.sqrt(b); // pierwiastek
        a *= 100;
        a = Math.round(a); // zaokraglenie do calkowitej
        a /= 100; // dwa miejsca po przecinku
        System.out.println(a);
    }

    public static void zadanie_03() {
        System.out.println("Zadanie_03: ");

        System.out.println("Podaj dwa ciągi tekstowe rozdzielone spacją: ");
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.next();
        String napis2 = scanner.next();

        System.out.println("\"%" + napis2 + " " + napis1 + "%\"");
    }

    public static void zadanie_04() {
        System.out.println("Zadanie_04: ");

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość a ");
        a = scanner.nextInt();
        System.out.println("Podaj wartość b ");
        b = scanner.nextInt();
        System.out.println("Podaj wartość c ");
        c = scanner.nextInt();
        if (a >= 0 && b >= 0 && c >= 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } else {
            System.out.println("BŁĄD");
        }
    }

    public static void zadanie_05() {
        System.out.println("Zadanie_05: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe odpowiadającą numerowi miesiąca: ");

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> System.out.println("Styczeń: 31 dni");
            case 2 -> System.out.println("Luty: 28 dni");
            case 3 -> System.out.println("Marzec: 31 dni");
            case 4 -> System.out.println("Kwiecień: 30 dni");
            case 5 -> System.out.println("Maj: 31 dni");
            case 6 -> System.out.println("Czerwiec: 30 dni");
            case 7 -> System.out.println("Lipiec: 31 dni");
            case 8 -> System.out.println("Sierpień: 31 dni");
            case 9 -> System.out.println("Wrzesień: 30 dni");
            case 10 -> System.out.println("Październik: 31 dni");
            case 11 -> System.out.println("Listopad: 30 dni");
            case 12 -> System.out.println("Grudzień: 31 dni");
            default -> System.out.println("BŁĄD");
        }
    }

    public static void zadanie_06() {
        System.out.println("Zadanie 6: ");
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double d;

        System.out.println("Podaj wartość a ");
        a = scanner.nextInt();
        System.out.println("Podaj wartość b ");
        b = scanner.nextInt();
        System.out.println("Podaj wartość c ");
        c = scanner.nextInt();

        if (a > b) {
            d = a;
            a = b;
            b = d;
        }
        if (a > c) {
            d = a;
            a = c;
            c = d;
        }
        if (b > c) {
            d = b;
            b = c;
            c = d;
        }
        System.out.println("Teraz od najmniejszych do najwiekszych: " + a + " " + b + " " + c);
        if (a < b) {
            d = a;
            a = b;
            b = d;
        }
        if (a < c) {
            d = a;
            a = c;
            c = d;
        }
        if (b < c) {
            d = b;
            b = c;
            c = d;
        }
        System.out.println("Teraz od najwiekszych do najmniejszych: " + a + " " + b + " " + c);
    }

    public static void zadanie_07() {
        System.out.println("Zadanie 7: ");
        Scanner scanner = new Scanner(System.in);

        int n;
        int m;


        System.out.println("Podaj wartość n ");
        n = scanner.nextInt();
        System.out.println("Podaj wartość m ");
        m = scanner.nextInt();
        if (n == m) {
            int[] tab_n = new int[n];
            int[] tab_m = new int[m];

            for (int i = 0; i < tab_n.length; i++) {
                System.out.println("Podaj wartość " + i + " elementu tablicy tab_n.");
                tab_n[i] = scanner.nextInt();
                System.out.println(i + " element tablicy tab_n =  " + tab_n[i]);
            }
            for (int j = 0; j < tab_m.length; j++) {
                System.out.println("Podaj wartość " + j + " elementu tablicy tab_m.");
                tab_m[j] = scanner.nextInt();
                System.out.println(j + " element tablicy tab_m =  " + tab_m[j]);
            }
            int iloczynSkalarny = 0;
            for (int k = 0; k < n; k++) {
                iloczynSkalarny += tab_n[k] * tab_m[k];
            }
            System.out.println("Iloczyn skalarny wynosi: " + iloczynSkalarny);
        } else {
            System.out.println("BŁĄD");
        }
    }

    public static void zadanie_08() {
        System.out.println("Zadanie 08: ");
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Podaj wartość n ");
        n = scanner.nextInt();
        char znak = '*';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
        int spacje = n - 1;
        int gwiazdki = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spacje; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= gwiazdki; j++) {
                System.out.print(znak);
            }
            System.out.println();
            spacje--;
            gwiazdki++;
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= spacje + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < gwiazdki; j++) {
                System.out.print(znak);
            }
            System.out.println();
            spacje++;
            gwiazdki--;
        }
    }

    public static void zadanie_09() {
        System.out.println("Zadanie 09: ");
        System.out.println("Podaj zdanie, spradzimy czy jest palindormem");

        Scanner scanner = new Scanner(System.in);
        String słowo = scanner.nextLine();
        int dlugosc = słowo.length();

        for (int i = 0; i < dlugosc / 2; i++) {
            char znak_1 = słowo.charAt(i);
            char znak_2 = słowo.charAt(słowo.length() - i - 1);

            if (znak_1 != znak_2) {
                System.out.println("NIE");
                break;
            } else {
                System.out.println("TAK");
                break;
            }
        }
    }
    public static void zadanie_10() {
        System.out.println("Zadanie 10: ");
        Scanner scanner = new Scanner(System.in);

        int r;
        int c;

        System.out.println("Podaj wartość r ");
        r = scanner.nextInt();
        System.out.println("Podaj wartość c ");
        c = scanner.nextInt();

        int[][] tablica1 = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Podaj kolejne wartości tablicy: ");
                tablica1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Macierz przed transpozycją: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz po transpozycji: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(tablica1[j][i] + " ");
            }
            System.out.println();

        }
    }
    public static void zadanie_11() {
        System.out.println("Zadanie 11: ");
        System.out.println("Podaj zdanie, spradzimy czy jest pangramem");

        Scanner scanner = new Scanner(System.in);
        String słowo = scanner.nextLine();
        String s = słowo.toLowerCase();
        System.out.println(s);
        int dlugosc = s.length();


            if(dlugosc < 26){
                System.out.println("false");
            }
            else
                for(char ch = 'a'; ch <= 'z'; ch++){
                    if(s.indexOf(ch) < 0){
                        System.out.println("false");
                    }
                    else {
                        System.out.println("true");
                        break;
                    }

                }
    }
    public static void zadanie_12() {
        System.out.println("Zadanie 12: ");
        Scanner scanner = new Scanner(System.in);

        double sekundy;
        System.out.println("Podaj wiek w sekundach");
        sekundy = scanner.nextDouble();

        double rok = 31557600;
        double Merkury = (sekundy / rok) / 0.2408467;
        double Wenus =  (sekundy / rok) / 0.61519726;
        double Mars =  (sekundy / rok) / 1.8808158;
        double Jowisz =  (sekundy / rok) / 11.862615;
        double Saturn =  (sekundy / rok) / 29.447498;
        double Uran =  (sekundy / rok) / 84.016846;
        double Neptun =  (sekundy / rok) / 164.79132;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Dla której planety wyliczyć wiek?: Ziemia, Merkury, Wenus, Mars, Jowisz, Saturn, Uran, Neptun ");
        String planeta = scanner1.nextLine();

        switch(planeta){
            case "Ziemia" -> System.out.println(sekundy / rok);
            case "Merkury" -> System.out.println(Merkury);
            case "Wenus" -> System.out.println(Wenus);
            case "Mars" -> System.out.println(Mars);
            case "Jowisz" -> System.out.println(Jowisz);
            case "Saturn" -> System.out.println(Saturn);
            case "Uran" -> System.out.println(Uran);
            case "Neptun" -> System.out.println(Neptun);
            default -> System.out.println("Nie ma takiej planety");
        }
    }
    public static void zadanie_13() {
        System.out.println("Zadanie 13: ");
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Podaj wartość n ");
        n = scanner.nextInt();

        int[] mojaTab = new int[n];

        for (int i = 0; i < mojaTab.length; i++) {
            System.out.println("Podaj kolejne wartości tablicy: ");
            mojaTab[i] = scanner.nextInt();
        }
        int max = mojaTab[0];
        for(int i =0; i < mojaTab.length; i++){
            if (mojaTab[i] > max)
                max = mojaTab[i];
            }
//        System.out.println();
        System.out.println(max);


    }
    public static void zadanie_14() {
        System.out.println("Zadanie 14: ");
        System.out.println("Napisałem prosty program w notatniku i zaposałem z rozszerzeniem .java");
        System.out.println("Nastepnie skompliwałem go za pomocą komendy 'javac', tworzac plik z rozszerzeniem javac ");
        System.out.println("Nastepnie uruchomiłem program za pomocą komandy 'java'");
    }
}

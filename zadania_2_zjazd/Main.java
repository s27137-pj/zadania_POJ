import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws java.io.IOException {

//        zadanie_2_1();
//        zadanie_2_2();
//        zadanie_2_3();
//        zadanie_2_4();
//        zadanie_2_5();
//        zadanie_2_6();
//        zadanie_2_7();
//        zadanie_2_8();
//        zadanie_2_9();
//        zadanie_2_10();
//        zadanie_2_11();
//        zadanie_2_12();
//        zadanie_2_13();
        zadanie_2_15();
    }
    public static void zadanie_2_1() {
        System.out.println("Zadanie 2.1: ");

        String imie = "Robert";
        String nazwisko = "Michałowski";
        String grupa = "5";
        String kierunek = "Informatyka niestacjonarna";

        System.out.println("Podaj imie: " + imie);
        System.out.println("Podaj nazwisko: " + nazwisko);
        System.out.println("Podaj grupe: " + grupa);
        System.out.println("Podaj kierunek: " + kierunek);

    }
    public static void zadanie_2_2() {
        System.out.println("Zadanie 2.2: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();
        System.out.println("Podaj grupe: ");
        String grupa = scanner.next();
        System.out.println("Podaj kierunek: ");
        String kierunek = scanner.next();

        System.out.println("Podaj imie: " + imie);
        System.out.println("Podaj nazwisko: " + nazwisko);
        System.out.println("Podaj grupe: " + grupa);
        System.out.println("Podaj kierunek: " + kierunek);
    }
    public static void zadanie_2_3() {
        System.out.println("Zadanie 2.3: ");

        WartosciDomyslne wartosci = new WartosciDomyslne();

        System.out.println("short s = " + wartosci.s);
        System.out.println("short s = " + wartosci.i);
        System.out.println("short s = " + wartosci.l);
        System.out.println("short s = " + wartosci.f);
        System.out.println("short s = " + wartosci.d);
        System.out.println("short s = " + wartosci.c);
        System.out.println("short s = " + wartosci.str);
        System.out.println("short s = " + wartosci.b);
    }
    public static void zadanie_2_4() {
        System.out.println("Zadanie 2.4: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj str1: ");
        String str1 = scanner.next();
        System.out.println("Podaj str2: ");
        String str2 = scanner.next();

        String s1 = "Ala";
        String s2 = "Ala";

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);

        System.out.println("str1 = str2: ");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }
    public static void zadanie_2_5() {
        System.out.println("Zadanie 2.5: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz przykład operatorow: \n1: inkrementacja i dekrementacja \n2. arytmetyczne \n3. relacyjne");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> {
                int x = 5;
                int y = 10;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("++x = " + (++x));
                System.out.println("y++ = " + (y++));
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            case 2 -> {
                double w = 33.5;
                double z = 17.3;
                System.out.println("w = " + w);
                System.out.println("z = " + z);
                System.out.println("w + z = " + (w + z));
                System.out.println("w - z = " + (w - z));
                System.out.println("w * z = " + (w * z));
                System.out.println("w / z = " + (w / z));
                System.out.println("w % z = " + (w % z));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            case 3 -> {
                int m = 3;
                int n = 17;
                int o = 10;
                System.out.println("m < n = " + (m < n));
                System.out.println("m > n = " + (m > n));
                System.out.println("m ≤ n = " + (m <= n));
                System.out.println("m ≥ n = " + (m >= n));
                System.out.println("m = n = " + (m = n));
                System.out.println("m ≠ n = " + (m != n));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
    public static void zadanie_2_6() {
        System.out.println("Zadanie 2.6: ");
        Scanner scanner = new Scanner(System.in);

        int r = 3;
        int c = 3;

        int[][] tablica1 = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Podaj kolejne wartości tablicy: ");
                tablica1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Tablica przed zamiana: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tablica po zamianie: ");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < c; j++) {
                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void zadanie_2_7() {
        System.out.println("Zadanie 2.7: ");
        Scanner scanner = new Scanner(System.in);
        int r;
        System.out.println("Podaj promien walca: ");
        r = scanner.nextInt();
        int h;
        System.out.println("Podaj wysokość walca:");
        h = scanner.nextInt();
        double pojemnosc = 3.141592 * r * r * h;
        System.out.println("Pojemnosc walca wynosi " + pojemnosc);
    }
    public static void zadanie_2_8() {
        System.out.println("Zadanie 2.8: ");
        String[][] dane = {{"P", "Q", "AND", "OR", "XOR", "NOT" },
                {"true", "true", "true", "true", "false", "false" },
                {"true", "false", "false", "true", "true", "false" },
                {"false", "true", "false", "true", "true", "true" },
                {"false", "false", "false", "false", "false", "true" }};
        for (String[] row : dane) {
            System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%n", row);
        }
    }
    public static void zadanie_2_9() throws java.io.IOException {
        System.out.println("Zadanie 2.9: ");
        int a;
        int b;
        System.out.println("Pomyslalem litere z przedzialu od A do Z, zgadnij ja!");
        Random znak = new Random();
        int los = znak.nextInt(26) + 65;    // zeby liczba byla z przedzialy charow z wielkimi literami
        System.out.println("losowa to: " + (char) los);

        a = System.in.read();
        if (a >= 65 & a <= 90) {
            while (los != a) {
                System.out.println("Zgaduj dalej");
                if (los > a) {
                    System.out.println("Zle! Trafiles zbyt nisko, garj dalej");
                    a = System.in.read();
                } else {
                    System.out.println("Zle! Trafiles zbyt wysoko");
                    a = System.in.read();
                }
            }
            while (los == a) {
                System.out.println("Gratulacje!");
                System.out.println("Litera to: " + (char) a);
                break;
            }
        } else {
            System.out.println("Nie wybrales znaku z przedzialu od A do Z");
        }
    }
    public static void zadanie_2_10() {
        System.out.println("Zadanie 2.10: ");

        for (int i = 0; i <= 14; i++) {

            double wynik = Math.pow(2, i);
            int wynikInt = (int) Math.pow(2, i);
            System.out.println("2 do potegi " + i + "wynosi: " + wynikInt);
        }
    }
    public static void zadanie_2_11() {
        System.out.println("Zadanie 2.11: ");

        VehicleZad11 miniVan = new VehicleZad11();
        miniVan.passengers = 7;
        miniVan.fuelcap = 80;
        miniVan.lkm = 10;

        VehicleZad11 sportsCar = new VehicleZad11();
        sportsCar.passengers = 2;
        sportsCar.fuelcap = 50;
        sportsCar.lkm = 20;

        int miniRange = miniVan.fuelcap / miniVan.lkm * 100;
        int sportRange = sportsCar.fuelcap / sportsCar.lkm * 100;

        System.out.println("Zasięg miniVana wynosi: " + miniRange + "km");
        System.out.println("Zasięg samochodu sportowego wynosi: " + sportRange + "km");
    }

    public static void zadanie_2_12() {
        System.out.println("Zadanie 2.12: ");

        VehicleZad12 miniVan = new VehicleZad12();
        miniVan.setPassengers(7);
        miniVan.setFuelcap(80);
        miniVan.setLkm(10);

        VehicleZad12 sportsCar = new VehicleZad12();
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(20);

        System.out.println("MiniVan przewozi: " + miniVan.getPassengers() + " osob.");
        System.out.println("Zasieg (km): " + miniVan.getRange());
        System.out.println("Auto sportowe przewozi: " + sportsCar.getPassengers() + " osob.");
        System.out.println("Zasieg (km): " + sportsCar.getRange());
    }

    public static void zadanie_2_13() {
        System.out.println("Zadanie 2.13: ");
        VehicleZad13 miniVan = new VehicleZad13();
        miniVan.setName("MiniVan");
        miniVan.setPassengers(7);
        miniVan.setFuelcap(80);
        miniVan.setLkm(10);

        VehicleZad13 sportsCar = new VehicleZad13();
        sportsCar.setName("Auto sportowe");
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(20);

        System.out.println(miniVan.getRange());
        System.out.println(sportsCar.getRange());

    }
    public static void zadanie_2_15() {
        System.out.println("Zadanie 2.15: ");

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Podaj ile kilometrow chcesz przejechac, a bedziesz wiedzial ile potrzebujesz paliwa.");
        x = scanner.nextInt();
        VehicleZad15 miniVan = new VehicleZad15();
        miniVan.setName("MiniVan");
        miniVan.setPassengers(7);
        miniVan.setFuelcap(80);
        miniVan.setLkm(10);
        miniVan.setDistance(x);

        VehicleZad15 sportsCar = new VehicleZad15();
        sportsCar.setName("Auto sportowe");
        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(50);
        sportsCar.setLkm(20);
        sportsCar.setDistance(x);

        System.out.println(miniVan.getRange());
        System.out.println(sportsCar.getRange());
    }
}
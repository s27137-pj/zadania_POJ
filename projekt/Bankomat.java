package projekt;
import java.util.Scanner;

public class Bankomat extends Baza {

    public static void main(String[] args) {


        System.out.println("Bank Smallenium, podaj nr klienta: ");

        Scanner scanner = new Scanner(System.in);
        Baza baza = new Baza();
        int input = scanner.nextInt();
        switch (input) {
            case 11111 -> {
                System.out.println("Witaj " + k1.getImie());
                int licznik = 0;
                boolean zablokowanaKarta = false;

                while(licznik < 3){
                    System.out.println("Podaj numer PIN");
                    int pin = scanner.nextInt();

                    if(pin == k1.getPin()) {
                        System.out.println("Nr PIN poprawny. Ile pieniedzy chcesz wyplacic?");
                        licznik = 0;

                        System.out.println("Ile pieniedzy chcesz wyplacic? ");
                        int kwota = scanner.nextInt();
                        if(kwota <= k1.getStanKonta() && kwota <= baza.getBankCashInfo()){
                        System.out.println("wypłacam srodki");
                        }

                        else if (kwota > k1.getStanKonta() && kwota != 0 && kwota <= baza.getBankCashInfo()){
                            System.out.println("Masz za mało pieniedzy. Maksymalna kwota ktora mozesz wyplacic to: " + k1.getStanKonta());
                            continue;
                        }
                        else if (kwota <= k1.getStanKonta() && kwota != 0 && kwota > baza.getBankCashInfo()){
                            System.out.println("Bankomat nie posiada tyle gotowki. Tymczasowo blokuje bankomat. Do zobaczenia!");
                            break;
                        }
                        break;
                    } else {
                        licznik++;
                        System.out.println("Niepoprawny nr PIN. Pozostalo prob: " + (3 - licznik));
                    }
                }
                if(licznik == 3) {
                    zablokowanaKarta = true;
                    System.out.println("Karta została zablokowana. W celu odblokowania skontaktuj sie z bankiem");
                }

                }
            case 22222 -> {
                System.out.println("Witaj " + k2.getImie());
                int licznik = 0;
                boolean zablokowanaKarta = false;

                while(licznik < 3){
                    System.out.println("Podaj numer PIN");
                    int pin = scanner.nextInt();

                    if(pin == k2.getPin()) {
                        System.out.println("Nr PIN poprawny. Ile pieniedzy chcesz wyplacic?");
                        licznik = 0;

                        System.out.println("Ile pieniedzy chcesz wyplacic? ");
                        int kwota = scanner.nextInt();
                        if(kwota <= k2.getStanKonta() && kwota <= baza.getBankCashInfo()){
                            System.out.println("wypłacam srodki");
                        }

                        else if (kwota > k2.getStanKonta() && kwota != 0 && kwota <= baza.getBankCashInfo()){
                            System.out.println("Masz za mało pieniedzy. Maksymalna kwota ktora mozesz wyplacic to: " + k1.getStanKonta());
                            continue;
                        }
                        else if (kwota <= k2.getStanKonta() && kwota != 0 && kwota > baza.getBankCashInfo()){
                            System.out.println("Bankomat nie posiada tyle gotowki. Tymczasowo blokuje bankomat. Do zobaczenia!");
                            break;
                        }
                        break;
                    } else {
                        licznik++;
                        System.out.println("Niepoprawny nr PIN. Pozostalo prob: " + (3 - licznik));
                    }
                }
                if(licznik == 3) {
                    zablokowanaKarta = true;
                    System.out.println("Karta została zablokowana. W celu odblokowania skontaktuj sie z bankiem");
                }

            }
            case 33333 -> {
                System.out.println("Witaj " + k3.getImie());
                int licznik = 0;
                boolean zablokowanaKarta = false;

                while(licznik < 3){
                    System.out.println("Podaj numer PIN");
                    int pin = scanner.nextInt();

                    if(pin == k3.getPin()) {
                        System.out.println("Nr PIN poprawny. Ile pieniedzy chcesz wyplacic?");
                        licznik = 0;

                        System.out.println("Ile pieniedzy chcesz wyplacic? ");
                        int kwota = scanner.nextInt();
                        if(kwota <= k3.getStanKonta() && kwota <= baza.getBankCashInfo()){
                            System.out.println("wypłacam srodki");
                        }

                        else if (kwota > k3.getStanKonta() && kwota != 0 && kwota <= baza.getBankCashInfo()){
                            System.out.println("Masz za mało pieniedzy. Maksymalna kwota ktora mozesz wyplacic to: " + k1.getStanKonta());
                            continue;
                        }
                        else if (kwota <= k3.getStanKonta() && kwota != 0 && kwota > baza.getBankCashInfo()){
                            System.out.println("Bankomat nie posiada tyle gotowki. Tymczasowo blokuje bankomat. Do zobaczenia!");
                            break;
                        }
                        break;
                    } else {
                        licznik++;
                        System.out.println("Niepoprawny nr PIN. Pozostalo prob: " + (3 - licznik));
                    }
                }
                if(licznik == 3) {
                    zablokowanaKarta = true;
                    System.out.println("Karta została zablokowana. W celu odblokowania skontaktuj sie z bankiem");
                }

            }
            case 44444 -> {
                System.out.println("Witaj " + k4.getImie());
                int licznik = 0;
                boolean zablokowanaKarta = false;

                while(licznik < 3){
                    System.out.println("Podaj numer PIN");
                    int pin = scanner.nextInt();

                    if(pin == k4.getPin()) {
                        System.out.println("Nr PIN poprawny. Ile pieniedzy chcesz wyplacic?");
                        licznik = 0;

                        System.out.println("Ile pieniedzy chcesz wyplacic? ");
                        int kwota = scanner.nextInt();
                        if(kwota <= k4.getStanKonta() && kwota <= baza.getBankCashInfo()){
                            System.out.println("wypłacam srodki");
                        }

                        else if (kwota > k4.getStanKonta() && kwota != 0 && kwota <= baza.getBankCashInfo()){
                            System.out.println("Masz za mało pieniedzy. Maksymalna kwota ktora mozesz wyplacic to: " + k1.getStanKonta());
                            continue;
                        }
                        else if (kwota <= k4.getStanKonta() && kwota != 0 && kwota > baza.getBankCashInfo()){
                            System.out.println("Bankomat nie posiada tyle gotowki. Tymczasowo blokuje bankomat. Do zobaczenia!");
                            break;
                        }
                        break;
                    } else {
                        licznik++;
                        System.out.println("Niepoprawny nr PIN. Pozostalo prob: " + (3 - licznik));
                    }
                }
                if(licznik == 3) {
                    zablokowanaKarta = true;
                    System.out.println("Karta została zablokowana. W celu odblokowania skontaktuj sie z bankiem");
                }
            }
            default -> System.out.println("Nr klienta nieprawidlowy. Chyba nie jestes klientem naszego banku!");
            }
        }
    }



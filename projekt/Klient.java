package projekt;

public class Klient {
    private String imie;
    private String nazwisko;
    private int nr_klienta;
    private int pin;
    private double stanKonta;

    private String drugieNazwisko;

    Klient(){}

    Klient(String imie, String nazwisko, String drugieNazwisko, int nr_klienta, int pin, double stanKonta){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.drugieNazwisko = drugieNazwisko;
        this.nr_klienta = nr_klienta;
        this.pin = pin;
        this.stanKonta = stanKonta;
    }

    Klient(String imie, String nazwisko, int nr_klienta, int pin, double stanKonta){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_klienta = nr_klienta;
        this.pin = pin;
        this.stanKonta = stanKonta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNr_klienta() {
        return nr_klienta;
    }

    public int getPin() {
        return pin;
    }

    public double getStanKonta() {
        return stanKonta;
    }
}

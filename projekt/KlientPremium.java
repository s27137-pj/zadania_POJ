package projekt;

public class KlientPremium extends Klient{
    private String premium = "tak";

    KlientPremium(String imie, String nazwisko, int nr_klienta, int pin, double stanKonta, String premium){
        getImie();
        getNazwisko();
        getNr_klienta();
        getPin();
        getStanKonta();
        this.premium = premium;
    }
}

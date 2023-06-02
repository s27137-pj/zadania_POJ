package projekt;

public class Baza implements BankInfo.BankCash {

    static Klient k1 = new Klient("Jan", "Kowalski", 11111, 1111, 1000);
    static Klient k2 = new Klient("Adam", "Nowak", 22222, 2222, 2000);
    static KlientPremium k3 = new KlientPremium("Piotr", "Gruszka", 33333, 3333,3000, "tak");

    static Klient k4 = new Klient("Marta", "Sęk", "Nowak", 44444, 4444, 4444);

    @Override
    public double getBankCashInfo() {
        return 1500;
    }



}

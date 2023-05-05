public class Car {
    int speed;
    double regularPrice = 10000;
    String color;

    public double getSalePrice(){
        return regularPrice;
    }

    interface Purchase {
        String getPurchaseInfo();
    }
}
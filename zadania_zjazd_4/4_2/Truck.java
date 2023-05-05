public class Truck extends Car implements Car.Purchase {
    int weight;

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice();
        }
    }

    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}
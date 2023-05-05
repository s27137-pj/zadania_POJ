class Ford extends Car implements Car.Purchase {
    int year;
    int manufacturerDiscount;

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
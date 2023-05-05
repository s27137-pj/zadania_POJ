public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.speed = 160;
        sedan.regularPrice = 20000;
        sedan.color = "red";
        sedan.length = 10;
        System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());

        Ford ford_1 = new Ford();
        ford_1.speed = 156;
        ford_1.regularPrice = 4452.0;
        ford_1.color = "black";
        ford_1.year = 2005;
        ford_1.manufacturerDiscount = 10;
        System.out.println(ford_1.getPurchaseInfo() + ford_1.getSalePrice());

        Ford ford_2 = new Ford();
        ford_2.speed = 155;
        ford_2.regularPrice = 5000.0;
        ford_2.color = "pink";
        ford_2.year = 1998;
        ford_2.manufacturerDiscount = 5;
        System.out.println(ford_2.getPurchaseInfo() + ford_2.getSalePrice());

        Truck truck = new Truck();
        truck.speed = 200;
        truck.regularPrice = 500000;
        truck.color = "gold";
        truck.weight = 5000;
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());
    }
}
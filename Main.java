public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(); // czesc b

        Circle c2 = new Circle(15); // czesc b

        Circle c3 = new Circle(20, "blue"); // czesc c

        Circle c4 = new Circle(); // czesc d
        c4.setRadius(22);
        c4.setColor("black");

        System.out.print("The circle c1 has radius of " + c1.getRadius()); // czesc b
        System.out.print(" and area of " + c1.getArea()); // czesc b
        System.out.println(" and color of " + c1.getColor());
        System.out.println(c1.toString());  // czesc e
        System.out.print("The circle c2 has radius of " + c2.getRadius()); // czesc b
        System.out.print(" and area of " + c2.getArea()); // czesc b
        System.out.println(" and color of " + c2.getColor());
        System.out.println(c2.toString()); // czesc e
        System.out.print("The circle c3 has radius of " + c3.getRadius()); // czesc c
        System.out.print(" and area of " + c3.getArea()); // czesc c
        System.out.println(" and color of " + c3.getColor());
        System.out.println(c3.toString()); // czesc e
        System.out.print("The circle c4 has radius of " + c4.getRadius()); // czesc d
        System.out.print(" and area of " + c4.getArea()); // czesc d
        System.out.println(" and color of " + c4.getColor());
        System.out.println(c4.toString()); // czesc e


    }
}


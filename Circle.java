public class Circle {
    private double radius;  // czesc a
    private String color;  // czesc a

    private double area;
    //settery, gettery

    public Circle() {
        this.radius = 10;
        this.color = "red";
    }  // pierwszy konstruktor - czesc a

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    } // drugi konstruktor - czesc a

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    } // czesc c

    public void setRadius(double radius) {
        this.radius = radius; // czesc e
    } // czesc d

    public void setColor(String color) {
        this.color = color; // czesc e
    } // czesc d

    public double getRadius() {
        return radius; // czesc e
    } //czesc a

    public double getArea() {
        area = Math.PI * radius * radius;
        return area; // czesc e
    } // czesc a

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Circle: radius = %s color = %s".formatted(radius, color);
    }   // czesc e
}

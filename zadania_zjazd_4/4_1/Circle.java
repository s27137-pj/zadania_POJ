public class Circle {
    double radius;
    String color;

    double area;

    public Circle(){
        this.radius = 1.0;
        this.color = "blue";
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public String toString() {
        return "Circle: radius = %s color = %s".formatted(radius, color);
    }

}
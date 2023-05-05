public class Cylinder extends Circle{
    double height = 4.0;
    double volume;

    public Cylinder(){
        this.height = 10.0;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius){
        this.radius = radius;
        this.height = 4.0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        volume = getArea() * height;
        return volume;
    }
}

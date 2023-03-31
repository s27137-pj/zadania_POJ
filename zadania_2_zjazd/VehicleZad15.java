public class VehicleZad15 {

    private String name;
    private int passengers;
    private int fuelcap;
    private int lkm;
    private double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    private double range;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassengers(int passengers){
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setFuelcap(int fuelcap){
        this.fuelcap = fuelcap;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setLkm(int lkm){
        this.lkm = lkm;
    }

    public int getLkm() {
        return lkm;
    }

    public String getRange() {
        range = (double)distance / 100 * (double)lkm;
        return name + " potrzebuje " + range + " litrow paliwa. ";
    }

}

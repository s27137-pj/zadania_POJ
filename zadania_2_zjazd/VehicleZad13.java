public class VehicleZad13 {
    private String name;
    private int passengers;
    private int fuelcap;
    private int lkm;
    private int range;
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
        range = fuelcap / lkm * 100;
        return name + " moze przewozic " + passengers + " osob na odleglosc do " + range + " kilometrow.";
    }
}

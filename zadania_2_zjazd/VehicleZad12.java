public class VehicleZad12 {

    private int passengers;
    private int fuelcap;
    private int lkm;

    private int range;


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

    public int getRange() {
        range = fuelcap / lkm * 100;
        return range;
    }

}

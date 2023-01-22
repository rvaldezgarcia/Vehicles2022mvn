public class Vehicle {

    private int milesPerGallon = 20;
    private double gallonsOfGas = 10.0;
    private int odometer = 0;

    private String color;

    public Vehicle() {
        int i = 1 + 1;
    }

    public Vehicle(int foo) {
        int i = 1 + 1;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void go(int milesDriven) {
        this.setGallonsOfGas( this.getGallonsOfGas() - (milesDriven / this.getMilesPerGallon()) ) ;
        this.setOdometer( this.getOdometer()  + milesDriven );
    }
}

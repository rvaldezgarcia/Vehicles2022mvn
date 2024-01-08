import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private int milesPerGallon = 20;
    private double gallonsOfGas = 10.0;
    private int odometer = 0;

    protected String description;

    private int previousOdometer = 0;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void go(int milesDriven) {

        previousOdometer = getOdometer();

        this.setGallonsOfGas( this.getGallonsOfGas() - (milesDriven / this.getMilesPerGallon()) ) ;
        this.setOdometer( this.getOdometer()  + milesDriven );
    }

    @Override
    public String toString() {
        return "Odometer " + getOdometer() + " || Gallons of Gas " + getGallonsOfGas();
    }

    public List<String> checkForRequiredMaintenance() {

        List<String> requiredMaintenance = new ArrayList<String>();
        int serviceInterval = getServiceInterval();

        if(serviceInterval >= previousOdometer && serviceInterval <= odometer) {
            requiredMaintenance = getRecommendations();
        }

        return requiredMaintenance;
    }

    protected abstract List<String> getRecommendations();

    protected abstract int getServiceInterval();
}

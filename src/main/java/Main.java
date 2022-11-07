import java.util.ArrayList;

public class Main {

    // private static int milesPerGallon = 20;
    // private static double gallonsOfGas = 10.0;
    // private static int odometer = 0;

    private static ArrayList<Vehicle>  allVehicles = new ArrayList<>();

    // private static int[] milesPerGallon = {20, 25, 15};
    // private static double[] gallonsOfGas = {10.0, 8, 12};
    // private static int[] odometer = {0, 10000, 20000};

    public static void main(String[] args) {
        System.out.println("In Vehicles Main");
        // System.out.println("Second");


        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setOdometer(0);
        allVehicles.add( myVehicle );

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonsOfGas(8);
        yourVehicle.setOdometer(10000);
        allVehicles.add( yourVehicle );

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(15);
        ourVehicle.setGallonsOfGas(12);
        ourVehicle.setOdometer(20000);
        allVehicles.add( ourVehicle );


        drive(100);
        drive(60);

    }

    private static void drive( int milesDriven) {

        for(Vehicle vehicle : allVehicles) {

            System.out.println("Odometer " + vehicle.getOdometer() + " || Gallons of Gas " + vehicle.getGallonsOfGas());
            vehicle.setGallonsOfGas( vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon()) ) ;
            vehicle.setOdometer( vehicle.getOdometer()  + milesDriven );
            System.out.println("Odometer " + vehicle.getOdometer() + " || Gallons of Gas " + vehicle.getGallonsOfGas());
        }
    }
}

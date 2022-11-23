import javax.swing.*;
import java.util.ArrayList;

public class Driver {

    // private static int milesPerGallon = 20;
    // private static double gallonsOfGas = 10.0;
    // private static int odometer = 0;

    private static ArrayList<Vehicle>  allVehicles = new ArrayList<>();

    // private static int[] milesPerGallon = {20, 25, 15};
    // private static double[] gallonsOfGas = {10.0, 8, 12};
    // private static int[] odometer = {0, 10000, 20000};

    public static void main(String[] args) {
        System.out.println("In Vehicles Driver");

        promptUser();

        displayOutput();
    }

    public static void promptUser() {

        System.out.println("Second Line");

        int goAgain = JOptionPane.NO_OPTION;

        do {

            String nickName = JOptionPane.showInputDialog("What is the nickname of this vehicle?");

            Vehicle vehicle = new Vehicle();

            String strMilesPerGallon = JOptionPane.showInputDialog("Enter Miles per Gallon:");
            int milesPerGallon = Integer.parseInt(strMilesPerGallon);
            vehicle.setMilesPerGallon(milesPerGallon);

            String strGallonsOfGas = JOptionPane.showInputDialog("Enter Gallons of Gas");
            double gallonsOfGas = Double.parseDouble(strGallonsOfGas);
            vehicle.setGallonsOfGas(gallonsOfGas);

            String strOdometer = JOptionPane.showInputDialog("Enter Odometer");
            int odometer = Integer.parseInt(strOdometer);
            vehicle.setOdometer(odometer);

            allVehicles.add( vehicle );
            
            goAgain = JOptionPane.showConfirmDialog(null, "Do you want to enter another vehicle?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        } while( goAgain == JOptionPane.YES_OPTION );

        /*
        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonsOfGas(8);
        yourVehicle.setOdometer(10000);
        allVehicles.add( yourVehicle );

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(15);
        ourVehicle.setGallonsOfGas(12);
        ourVehicle.setOdometer(20000);
        allVehicles.add( ourVehicle ); */

        /*
        displayOutput(100);
        displayOutput(60);
        */

    }

    private static void displayOutput() {

        do {

            String strMilesDriven = JOptionPane.showInputDialog("How far do you want to go?");
            int milesDriven = Integer.parseInt(strMilesDriven);
            
            for(Vehicle vehicle : allVehicles) {

                System.out.println("Odometer " + vehicle.getOdometer() + " || Gallons of Gas " + vehicle.getGallonsOfGas());
                vehicle.setGallonsOfGas( vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon()) ) ;
                vehicle.setOdometer( vehicle.getOdometer()  + milesDriven );
                System.out.println("Odometer " + vehicle.getOdometer() + " || Gallons of Gas " + vehicle.getGallonsOfGas());
            }

        } while( JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you want to take another trip?", "Go Again?", JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE) );


    }
}

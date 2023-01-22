import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    protected Vehicle vehicle;

    @Test
    protected void go_increaseOdomoterBy100AndDecreaseGallonsOfGasBy5WhenMilesPerGallonIs20() {
        givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon();
        whenDrive100();
        thenOdomoterIncreasesBy100AndGallonsOfGasDecreasesBy5();
    }

    protected void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon() {

        vehicle = new Vehicle();

        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }

    protected void whenDrive100() {
        vehicle.go(100);
    }

    protected void thenOdomoterIncreasesBy100AndGallonsOfGasDecreasesBy5() {
        assertEquals(100, vehicle.getOdometer());
        assertEquals(10, vehicle.getGallonsOfGas());
    }
}

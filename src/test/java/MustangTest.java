import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("No use")
public class MustangTest extends VehicleTest{

    Mustang mustang;

    protected void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon() {

        vehicle = new Mustang();

        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }

    @Test
    public void convertible_WhenConvertibleItIsAConvertible() {

        givenMustangCanBeAConvertible();
        whenMustangIsAConvertible();
        thenMustangIsAConvertible();
    }

    private void givenMustangCanBeAConvertible() {
        mustang = new Mustang();
    }

    private void whenMustangIsAConvertible() {
        mustang.setConvertible(true);
    }

    private void thenMustangIsAConvertible() {
        assertTrue( mustang.isConvertible() );
    }
}

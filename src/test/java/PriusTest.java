import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("No use")
public class PriusTest {


    private Prius prius;

    @Test
    public void go_runningWithGas() {
        given_GallonsOfGas10_Odometer0_MilesPerGallon50_Charge4();
        when_Driven_100Miles();
        then_GallonsOfGas80_Odomoter100_MilliampHours9();
    }

    private void given_GallonsOfGas10_Odometer0_MilesPerGallon50_Charge4() {

        prius = new Prius();

        prius.setGallonsOfGas(10);
        prius.setOdometer(0);
        prius.setMilesPerGallon(50);
        prius.setCharge(4);
    }

    private void when_Driven_100Miles() {

        prius.go(100);
    }

    private void then_GallonsOfGas80_Odomoter100_MilliampHours9() {
        assertEquals(8, prius.getGallonsOfGas());
        assertEquals(100, prius.getOdometer());
        assertEquals(9, prius.getCharge());
    }

    @Test
    public void go_runningWithElectricity() {
        given_GallonsOfGas10_Odometer100_MilliampHours9();
        when_Driven_100Miles();
        then_GallonsOfGas10_Odometer200_Charge5();
    }

    private void given_GallonsOfGas10_Odometer100_MilliampHours9() {
        prius = new Prius();
        prius.setGallonsOfGas(10);
        prius.setOdometer(100);
        prius.setMilesPerGallon(50);
        prius.setCharge(9);
    }

    private void then_GallonsOfGas10_Odometer200_Charge5() {
        assertEquals(10, prius.getGallonsOfGas());
        assertEquals(200, prius.getOdometer());
        assertEquals(5 , prius.getCharge());
    }
}

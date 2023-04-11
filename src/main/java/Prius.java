public class Prius extends Vehicle implements LowEmissionVehicle {

    public static final int CHARGE_DENOMINATOR = 20;
    public static final int MILES_PER_MILLIAMP_PER_HOUR = 25;
    private int charge;

    private int taxRebate = 0;

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public void go(int milesDriven) {

        if( charge < 5 ) {

            super.go(milesDriven);
            charge = charge + (milesDriven/ CHARGE_DENOMINATOR);
        }
        else if( charge >= 5) {

            charge -=  milesDriven / MILES_PER_MILLIAMP_PER_HOUR;
            setOdometer( getOdometer() + milesDriven );
        }

    }

    @Override
    public String toString() {
        return super.toString() + " Battery Charge: " + charge + " Tax Credit: " + taxRebate;
    }

    @Override
    public void applyTaxRebate(int amount) {
        taxRebate = amount;
    }
}

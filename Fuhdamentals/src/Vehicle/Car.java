package Vehicle;



public class Car extends Vehicle{
    private static final double ADDITIONAL_AC_FUEL = 0.9;

    public Car(double fuelQuantity, double fuelConsumption,int tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
    }





    @Override
    public void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + ADDITIONAL_AC_FUEL );
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f",super.getFuelQuantity());
    }
}

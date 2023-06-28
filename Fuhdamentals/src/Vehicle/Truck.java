package Vehicle;

public class Truck extends Vehicle{
    private static final double ADDITIONAL_AC_FUEL = 1.6;
    protected Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
    }



    @Override
    protected void refuel(double refueledLitters) {

        if((getFuelQuantity() + 0.95*refueledLitters) > getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else if((getFuelQuantity() + refueledLitters) <= getTankCapacity()){
            setFuelQuantity(getFuelQuantity() + 0.95*refueledLitters);
        }

        if(refueledLitters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
    }

    @Override
    public void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + ADDITIONAL_AC_FUEL );
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f",super.getFuelQuantity());
    }
}

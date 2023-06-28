package Vehicle;

import java.text.DecimalFormat;

public class Bus extends Vehicle{

    private static final double ADDITIONAL_AC_FUEL = 1.4;

    protected Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void driveEmpty(double distance){
        double fuelNeeded = distance * (super.getFuelConsumption() - ADDITIONAL_AC_FUEL);
        if(fuelNeeded <= super.getFuelQuantity()){
            setFuelQuantity(super.getFuelQuantity() - fuelNeeded);
            DecimalFormat d = new DecimalFormat("0.##");
            System.out.printf("%s travelled %s km%n",this.getClass().getSimpleName(),d.format(distance));
        }else{
            System.out.printf("%s needs refueling%n",this.getClass().getSimpleName());
        }
    }



    @Override
    public void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + ADDITIONAL_AC_FUEL );
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f",super.getFuelQuantity());
    }
}

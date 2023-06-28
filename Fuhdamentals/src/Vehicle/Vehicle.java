package Vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;


    protected Vehicle(double fuelQuantity, double fuelConsumption,int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    protected  void drive(double distance){

            double fuelNeeded = distance * (getFuelConsumption());
            if(fuelNeeded <= getFuelQuantity()){
                setFuelQuantity(getFuelQuantity() - fuelNeeded);
                DecimalFormat d = new DecimalFormat("0.##");
                System.out.printf("%s travelled %s km%n",this.getClass().getSimpleName(),d.format(distance));
            }else{
                System.out.printf("%s needs refueling%n",this.getClass().getSimpleName());
            }

    }

    protected void refuel(double refueledLitters) {
        if(refueledLitters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if((this.getFuelQuantity() + refueledLitters) > this.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else if((this.getFuelQuantity() + refueledLitters) <= this.getTankCapacity()){
            this.setFuelQuantity(this.getFuelQuantity() + refueledLitters);
        }


    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if(this.fuelQuantity < 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }else {
            this.fuelQuantity = fuelQuantity;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}

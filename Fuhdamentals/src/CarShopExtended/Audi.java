package CarShopExtended;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("This is %s produced in %s and have %d tires", this.getModel(), this.getCountryProduced(), this.TIRES)).append(System.lineSeparator());
        str.append(String.format("Minimum rental period of %d days. Price per day %f", this.getMinRentDay(), this.getPricePerDay()));
        return str.toString();
    }
}


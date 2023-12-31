package CarShopExtended;

public class Seat extends CarImpl implements Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced,Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("This is %s produced in %s and have %d tires", this.getModel(), this.getCountryProduced(), this.TIRES)).append(System.lineSeparator());
        str.append(String.format("%s sells for %f", this.getModel(), this.getPrice()));
        return str.toString();
    }
}

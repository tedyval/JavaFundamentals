package WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    protected Mammal(String animalType, String animalName, double animalWeight,String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(),this.getAnimalName(),df.format(this.getAnimalWeight()),this.livingRegion,this.getFoodEaten());
    }
}

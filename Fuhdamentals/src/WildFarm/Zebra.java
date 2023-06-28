package WildFarm;

public class Zebra extends Mammal{
    protected Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }

    @Override
    protected void eat(Food food) {

        if(food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }

        super.eat(food);

    }
}

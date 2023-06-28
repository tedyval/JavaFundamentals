package WildFarm;

public class Tiger extends Felime {
    protected Tiger(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    protected void eat(Food food) {

        if(food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }

        super.eat(food);
    }
}

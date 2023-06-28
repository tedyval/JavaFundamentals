package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if(flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        } else{
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade") ){
            this.bakingTechnique = bakingTechnique;
        } else{
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if(weight >= 1 && weight <=  200){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories(){
        double caloriesOfFlourType =flourType.equals("White") ? 1.5 : 1.0;
        double caloriesOfBakingTechnique = 0;
        switch(bakingTechnique){
            case "Crispy":
                caloriesOfBakingTechnique = 0.9;
                break;
            case "Chewy":
                caloriesOfBakingTechnique = 1.1;
                break;
            case "Homemade":
                caloriesOfBakingTechnique = 1.0;
                break;
        }

        return 2 * weight * caloriesOfFlourType * caloriesOfBakingTechnique;

    }
}

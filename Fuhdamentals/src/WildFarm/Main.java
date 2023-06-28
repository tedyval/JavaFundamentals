package WildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Mammal> mammals = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");


            Mammal mammal = createMamal(tokens);
            Food food = createFood(scanner.nextLine());
            mammal.makeSound();
            try{
                mammal.eat(food);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


            mammals.add(mammal);
            input = scanner.nextLine();
        }

        for (Mammal mammal : mammals) {
            System.out.println(mammal);
        }


    }

    private static Food createFood(String nextLine) {
        String[] tokens= nextLine.split("\\s+");
        String foodType = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);
        Food food = null;
        switch(foodType){
            case "Vegetable":
               food = new Vegetable(quantity);
                break;
            case "Meat":
                food = new Meat(quantity);
                break;

        }
        return food;
    }

    private static Mammal createMamal(String[] tokens) {
        String type = tokens[0];
        String name = tokens[1];
        double weight = Double.parseDouble(tokens[2]);
        String region = tokens[3];
        Mammal mammal = null;
        if (tokens.length == 4) {
            switch (type) {
                case "Mouse":
                    mammal = new Mouse(type, name, weight, region);
                    break;
                case "Tiger":
                    mammal = new Tiger(type, name, weight, region);
                    break;
                case "Zebra":
                    mammal = new Zebra(type, name, weight, region);
                    break;

            }

        } else if (tokens.length == 5) {
            String breed = tokens[4];
            mammal = new Cat(type, name, weight, region,breed);
        }

        return mammal;

    }
}

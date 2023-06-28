package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       while(!input.equals("END")){
           String[]  pizzaCharacteristics = input.split("\\s+");
           String pizzaName = pizzaCharacteristics[1];
           int numberOfToppings = Integer.parseInt(pizzaCharacteristics[2]);
           Pizza pizza = null;
           try{
                pizza = new Pizza(pizzaName,numberOfToppings);
           }catch(IllegalArgumentException e){
               System.out.println(e.getMessage());
           }

           Dough dough;
           String[] doughCharacteristics = scanner.nextLine().split("\\s+");
           String flourType= doughCharacteristics[1];
           String backingType = doughCharacteristics[2];
           double weight = Double.parseDouble(doughCharacteristics[3]);
           try{
               dough = new Dough(flourType,backingType,weight);
               pizza.setDough(dough);
           }catch(IllegalArgumentException e){
               System.out.println(e.getMessage());
           }


           Topping topping;
           for (int i = 0; i < numberOfToppings ; i++) {
               String[] toppingsCharacteristics = scanner.nextLine().split("\\s+");
               String toppingType = toppingsCharacteristics[1];
               double weightOfTopping = Double.parseDouble(toppingsCharacteristics[2]);
               try{
                   topping = new Topping(toppingType,weightOfTopping);
                   pizza.addTopping(topping);
               }catch(IllegalArgumentException e){
                   System.out.println(e.getMessage());
               }
           }

           System.out.println(pizza);


           input = scanner.nextLine();
       }





    }

}

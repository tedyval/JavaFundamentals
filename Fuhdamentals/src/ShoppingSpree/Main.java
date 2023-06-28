package ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleMoneyStrings = scanner.nextLine().split(";");
        String[] productCostStrings = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();
        for (int i = 0; i < peopleMoneyStrings.length; i++) {
            String name = peopleMoneyStrings[i].split("=")[0];
            double money = Double.parseDouble(peopleMoneyStrings[i].split("=")[1]);
            try {
                Person person = new Person(name, money);
                people.putIfAbsent(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < productCostStrings.length; i++) {
            String name = productCostStrings[i].split("=")[0];
            double cost = Double.parseDouble(productCostStrings[i].split("=")[1]);
            try {
                Product product = new Product(name, cost);
                products.putIfAbsent(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String name =input.split(" ")[0];
            String product =input.split(" ")[1];
            try{
                people.get(name).buyProduct(products.get(product));
                System.out.printf("%s bought %s%n",name,product);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


            input = scanner.nextLine();
        }

        for (Person value : people.values()) {
            System.out.println(value);
        }


    }

}

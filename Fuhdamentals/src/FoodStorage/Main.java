package FoodStorage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Buyer> buyers = new LinkedHashMap<>();
        Set<String> names = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            if(names.contains(name)){
                continue;
            }
            names.add(name);
            int age = Integer.parseInt(tokens[1]);
            Buyer buyer = null;
            if(tokens.length == 4){
                String id = tokens[2];
                String birthday = tokens[3];
                buyer = new Citizen(name,age,id,birthday);
                buyer.buyFood();
                buyers.put(name,buyer);
            }else if(tokens.length == 3){
                String group = tokens[2];
                buyer = new Rebel(name,age,group);
                buyer.buyFood();
                buyers.put(name,buyer);
            }
        }



        String nameChecked = scanner.nextLine();
        int totalFood = 0;
        while(!nameChecked.equals("End")) {
            if (buyers.containsKey(nameChecked)) {
                totalFood += buyers.get(nameChecked).getFood();
            }

            nameChecked = scanner.nextLine();
        }

        System.out.println(totalFood);



    }
}

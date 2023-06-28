package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthables = new ArrayList<>();
        String input = scanner.nextLine();
        while(!input.equals("End")){
            fillBirtableInList(birthables, input);
            input = scanner.nextLine();
        }

        print(scanner, birthables);


    }

    private static void print(Scanner scanner, List<Birthable> birthables) {
        String year = scanner.nextLine();

        int count = 0;
        for (Birthable birthable : birthables) {
            if(birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
            }else {
                count++;
            }
        }

        if(count == birthables.size()){
            System.out.println("<no output>");

        }
    }

    private static void fillBirtableInList(List<Birthable> birthables, String input) {
        String[] tokens = input.split("\\s+");
        String type = tokens[0];
        Birthable entity= null;
        switch(type){
            case "Citizen":
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                String birthday = tokens[4];
            entity = new Citizen(name,age,id,birthday);
            birthables.add(entity);
                break;
            case "Robot":
                break;
            case "Pet":
                String name1 = tokens[1];
                String birthday1 = tokens[2];
                entity = new Pet(name1,birthday1);
                birthables.add(entity);

                break;
        }
    }
}

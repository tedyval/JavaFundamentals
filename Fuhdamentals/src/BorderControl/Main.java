package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Identifiable> membersOfCity = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            Identifiable member = getMember(membersOfCity, input);
            input = scanner.nextLine();

        }

        int lastDigits = Integer.parseInt(scanner.nextLine());
        String digitsAsString = String.valueOf(lastDigits);

        for (Identifiable identifiable : membersOfCity) {
            if (identifiable.getId().endsWith(digitsAsString)) {
                System.out.println(identifiable.getId());
            }
        }


    }

    private static Identifiable getMember(List<Identifiable> membersOfCity, String input) {
        String[] tokens = input.split("\\s+");
        Identifiable member = null;
        if (tokens.length == 3) {
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String id = tokens[2];
            member = new Citizen(name, age, id);
            membersOfCity.add(member);
        } else if (tokens.length == 2) {
            String model = tokens[0];
            String id = tokens[1];
            member = new Robot(model, id);
            membersOfCity.add(member);
        }
        return member;
    }


}

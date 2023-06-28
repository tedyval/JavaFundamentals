package EnterNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum  = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        try {
            NumbersInRange numbers = new NumbersInRange(startNum,endNum);
            numbers.print();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter new numbers!");

        }
    }
}

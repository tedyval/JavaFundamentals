package Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        Ferrari ferrari = new Ferrari(names);
        System.out.println(ferrari);
    }
}

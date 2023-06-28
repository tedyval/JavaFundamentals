package Syntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount   = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice  = Double.parseDouble(scanner.nextLine());
        double keyboardPrice  = Double.parseDouble(scanner.nextLine());
        double displayPrice  = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;



        headsetCount = lostGamesCount / 2;
        mouseCount = lostGamesCount / 3;
        keyboardCount = lostGamesCount / 6;
        displayCount = lostGamesCount / 12;

        double cost = headsetCount * headsetPrice + mouseCount * mousePrice + keyboardCount * keyboardPrice + displayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",cost);













    }
}

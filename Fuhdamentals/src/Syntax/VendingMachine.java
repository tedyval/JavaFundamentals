package Syntax;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();

        boolean invalid = false;
        double sumMoney = 0;
        while (!comand.equals("Start")) {
            double coin = Double.parseDouble(comand);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sumMoney += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            comand = scanner.nextLine();
        }

        double price = 0;

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    invalid = true;
                    System.out.println("Invalid product");
                    break;

            }

            if (sumMoney >= price && invalid == false) {
                sumMoney -= price;
                System.out.printf("Purchased %s%n", product);
            } else if(sumMoney >= price && invalid == true){

            }else{
                System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sumMoney);


    }
}

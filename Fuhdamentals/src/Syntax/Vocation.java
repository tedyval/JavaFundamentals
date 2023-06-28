package Syntax;

import java.util.Scanner;

public class Vocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double priceOfRoom = 0;
        switch(typeOfGroup){
            case "Students":
                switch(dayOfWeek){
                    case "Friday":
                        priceOfRoom = 8.45;
                        break;
                    case "Saturday":
                        priceOfRoom = 9.80;
                        break;
                    case "Sunday":
                        priceOfRoom = 10.46;
                        break;
                }
                break;
            case "Business":
                switch(dayOfWeek){
                    case "Friday":
                        priceOfRoom = 10.90;
                        break;
                    case "Saturday":
                        priceOfRoom = 15.60;
                        break;
                    case "Sunday":
                        priceOfRoom = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch(dayOfWeek){
                    case "Friday":
                        priceOfRoom = 15.00;
                        break;
                    case "Saturday":
                        priceOfRoom = 20.00;
                        break;
                    case "Sunday":
                        priceOfRoom = 22.50;
                        break;
                }
                break;
        }

        double price = personCount * priceOfRoom;
        switch(typeOfGroup){
            case "Students":
                if(personCount >= 30){
                    price *= 0.85;
                }
                break;
            case "Business":
                if(personCount >= 100){
                    price = price - 10 * priceOfRoom;
                }
                break;
            case "Regular":
                if(personCount >= 10 && personCount <= 20 ){
                    price *= 0.95;
                }
                break;

        }
        System.out.printf("Total price: %.2f",price);














    }
}

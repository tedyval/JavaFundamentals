package Syntax;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int divisor = 0;
        if(num % 10 == 0){
            divisor = 10;
        } else if(num % 7 == 0){
            divisor = 7;
        }else if(num % 6 == 0){
            divisor = 6;
        }else if(num % 3 == 0){
            divisor = 3;
        }else if(num % 2 == 0){
            divisor = 2;
        }
        if(divisor != 0){
            System.out.printf("The number is divisible by %d",divisor);
        }else{
            System.out.println("Not divisible");
        }






    }
}

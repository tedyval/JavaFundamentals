package Syntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num1 = num;
        int digit = 0;
        int factorial = 1;
        int sum = 0;
        if(num1 < 10){
            for (int i = 1; i <=num1 ; i++) {
                factorial *= i;
            }
            sum = factorial;
        } else {

            while(num1 > 0) {
                factorial = 1;
                digit = num1 % 10;
                if(digit == 0){
                    factorial = 1;
                }else {

                    for (int i = 1; i <= digit; i++) {
                        factorial *= i;
                    }
                }
                sum += factorial;
                num1 = num1 / 10;
            }
        }

        if(sum == num){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }











    }
}

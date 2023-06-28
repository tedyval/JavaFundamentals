package SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        try {
            Number number = new Number(n);
            System.out.println(number.squareRoot());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("Good bye");
        }


    }
}

package Syntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reversedUsername = "";
        for (int i = username.length() - 1; i >= 0 ; i--){
           char letter = username.charAt(i);
           reversedUsername += letter;
        }

        int counter = 0;
        String currentPassword = scanner.nextLine();
        while(!currentPassword.equals(reversedUsername)){
            counter++;
            if(counter > 3){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            currentPassword = scanner.nextLine();

        }

        if(currentPassword.equals(reversedUsername)){
            System.out.printf("User %s logged in.",username);
        }


    }
}

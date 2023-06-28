package Syntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney  = Double.parseDouble(scanner.nextLine());
        int countOfStudents  = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers  = Double.parseDouble(scanner.nextLine());
        double priceOfRobes  = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double sumLigtsabers = Math.ceil(countOfStudents * 1.10) * priceOfLightsabers;
        double sumRobes = countOfStudents * priceOfRobes;
        double sumBelts = 0;
        if(countOfStudents >= 6) {
             sumBelts = countOfStudents * priceOfBelts - (countOfStudents / 6) * priceOfBelts;
        }else{
             sumBelts = countOfStudents * priceOfBelts;
        }

        double expenses = sumBelts + sumLigtsabers +sumRobes;

        if( amountOfMoney >= expenses){
            System.out.printf("The money is enough - it would cost %.2flv.",expenses);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(amountOfMoney-expenses));
        }





    }
}

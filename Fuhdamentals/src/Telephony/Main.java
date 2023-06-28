package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phoneNumbersInArray =scanner.nextLine().split("\\s+");
        List<String> phoneNumbers = new ArrayList<>(Arrays.asList(phoneNumbersInArray));
        String[] input2 = scanner.nextLine().split("\\s+");
        List<String> urls = new ArrayList<>(Arrays.asList(input2));
        Smartphone smartphone = new Smartphone(phoneNumbers, urls);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}

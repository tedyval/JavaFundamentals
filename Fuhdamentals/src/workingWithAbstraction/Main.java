package workingWithAbstraction;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readDimensions(scanner.nextLine());
        int row = dimensions[0];
        int col = dimensions[1];

       Field field = new Field(row,col);
       Galaxy galaxy = new Galaxy(field);

        String command = scanner.nextLine();

        long totalStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediDimensions = readDimensions(command);
            int[] evilDimensions = readDimensions(scanner.nextLine());
            int rowEvil = evilDimensions[0];
            int colEvil = evilDimensions[1];

            galaxy.moveEvil(rowEvil,colEvil);

            int rowJedi = jediDimensions[0];
            int colJedi = jediDimensions[1];

             totalStars = galaxy.moveJedi(rowJedi,colJedi);


            command = scanner.nextLine();
        }

        System.out.println(totalStars);
    }



    private static int[] readDimensions(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}

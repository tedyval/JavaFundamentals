import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberSnowballs = Byte.parseByte(scanner.nextLine());

        short snowballSnow = 0;
        short snowballTime= 0;
        byte snowballQuality =0;
        double snowballValue = 0;
        double maxValue = Double.NEGATIVE_INFINITY;
        short snowballSnow1 = 0;
        short snowballTime1= 0;
        byte snowballQuality1 =0;


        for (int i = 1; i <= numberSnowballs; i++) {
            snowballSnow = Short.parseShort(scanner.nextLine());
            snowballTime = Short.parseShort(scanner.nextLine());
            snowballQuality = Byte.parseByte(scanner.nextLine());

            snowballValue =  Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                 snowballSnow1 = snowballSnow;
                 snowballTime1= snowballTime;
                 snowballQuality1 = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnow1, snowballTime1, maxValue, snowballQuality1);


    }
}

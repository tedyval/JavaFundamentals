package JavaAdvancedExam26Oct2019;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();
        ArrayDeque<Integer> females = new ArrayDeque<>();
        String[] maleAsString = scanner.nextLine().split(" ");
        for (int i = 0; i < maleAsString.length ; i++) {
            males.push(Integer.parseInt(maleAsString[i]));
        }

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(females::offer);
        int matches = 0;
        while(!females.isEmpty() && !males.isEmpty()){
            males.removeIf(m-> m <= 0);
            females.removeIf(f -> f <= 0);

            int woman = females.peek();
            int man = males.peek();

            if(man % 25 == 0){
                males.pop();
                males.pop();
                continue;
            }
            if(woman % 25 == 0){
                females.poll();
                females.poll();
                continue;
            }

         if(woman == man){
             males.pop();
             females.poll();
             matches++;
         }else{
             females.poll();
             int changed = males.pop() - 2;
             males.push(changed);
         }



        }

        System.out.printf("Matches: %d%n",matches);
        if(males.isEmpty()){
            System.out.println("Males left: none");
        }else{
            String out = males.stream().map(String::valueOf).collect(Collectors.joining(", "));
            StringBuilder str = new StringBuilder();
            str.append("Males left: ").append(out);
            String output = str.toString();
            System.out.println(output);
        }

        if(females.isEmpty()){
            System.out.println("Females left: none");
        }else{
            String out = females.stream().map(String::valueOf).collect(Collectors.joining(", "));
            StringBuilder str = new StringBuilder();
            str.append("Females left: ").append(out);
            String output = str.toString();
            System.out.println(output);
        }








    }
}

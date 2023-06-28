package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("Beast!")){
            String type = input;
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age   = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            switch(type){
                case "Cat":
                    try{
                        Cat cat = new Cat(name,age,gender);
                        System.out.println(cat);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Dog":
                    try{
                        Dog dog = new Dog(name,age,gender);
                        System.out.println(dog);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Frog":
                    try{
                        Frog frog  = new Frog(name,age,gender);
                        System.out.println(frog);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Kitten":
                    try{
                        Kitten kitten = new Kitten(name,age);
                        System.out.println(kitten);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Tomcat":
                    try{
                        Tomcat tomcat = new Tomcat(name,age);
                        System.out.println(tomcat);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

            }



            input = scanner.nextLine();
        }

    }
}

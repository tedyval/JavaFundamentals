package ValidPerson;

public class Main {
    public static void main(String[] args) {

        try {
            Student student = new Student("4havdar","4avdar.@abv.bg");
//            Person person = new Person("Peter", "Aimee", 21);
//            Person person1 = new Person("", "Aimee", 21);
//            Person person2 = new Person("Peter", null, 21);
//            Person person3 = new Person("Peter", "Aimee", -1);
        }catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());;
        }



//        Person person4 = new Person("Peter", "Aimee", 121);
    }
}

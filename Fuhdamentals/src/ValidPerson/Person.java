package ValidPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private void setAge(int age) {
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("The age must to be between 0 and 120 incl.");
        }
        this.age = age;

    }

    private void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("The  name cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    private void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("The  name cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if(this.age < 30 ){
            this.setSalary((this.getSalary() * bonus) / 200 + this.getSalary());
        }else{
            this.setSalary((this.getSalary() * bonus ) / 100 + this.getSalary());
        }

    }

    @Override
    public String toString() {
        return String.format("%s %s is %s years old.",firstName,lastName,salary);
    }
}

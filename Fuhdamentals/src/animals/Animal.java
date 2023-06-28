package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setName(String name){
        if(name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Invalid input!");
        }else{
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }else{
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if(gender.trim().isEmpty() || gender == null){
            throw new IllegalArgumentException("Invalid input!");
        }else{
            this.gender = gender;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound(){
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        str.append(String.format("%s %d %s",this.name,this.age,this.gender)).append(System.lineSeparator());
        str.append(this.produceSound());

        return str.toString();
    }
}

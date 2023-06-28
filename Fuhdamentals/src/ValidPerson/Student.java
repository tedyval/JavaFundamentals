package ValidPerson;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) throws InvalidPersonNameException {
        this.setName(name);
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidPersonNameException {
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i))){
                throw new InvalidPersonNameException("Name sould contains only letters.");
            }
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

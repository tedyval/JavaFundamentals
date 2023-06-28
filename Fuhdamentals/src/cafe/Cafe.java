package cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
     if(employees.size() < capacity){
         employees.add(employee);
     }
    }

    public boolean removeEmployee(String name){
        int sizeBefore = employees.size();
      employees.removeIf(e -> e.getName().equals(name));
        int sizeAfter = employees.size();
       if(sizeAfter< sizeBefore){
           return true;
       }
       return false;
    }

    public Employee getOldestEmployee(){

        Employee max = employees.get(0);
        for (int i = 1; i < employees.size() ; i++) {
            if(employees.get(i).getAge() > max.getAge()){
                max = employees.get(i);
            }
        }
        return max;

    }

    public Employee getEmployee(String name){
        for (Employee employee : employees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }
     return null;
    }

    public int getCount(){
        return employees.size();
    }

    public String report(){
        StringBuilder str = new StringBuilder();
        str.append(String.format("Employees working at Cafe %s:",this.name)).append("\n");
              employees.forEach(e-> str.append(e.toString()).append("\n"));
      return str.toString();
    }






}

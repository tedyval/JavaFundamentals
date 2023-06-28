package christmas;

import java.util.*;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

   public Bag(String color, int capacity){
       this.color = color;
       this.capacity = capacity;
       this.data = new ArrayList<>();
   }

   public String getColor(){
       return this.color;
   }

    public int getCapacity(){
        return this.capacity;
    }

    public int count(){
       return data.size();
    }

    public void add(Present present){
       if(data.size() < capacity){
           data.add(present);
       }
    }

    public boolean remove(String name){
      return data.removeIf(p-> p.getName().equals(name));

   }

   public Present heaviestPresent(){
       Present present = data.stream().max(Comparator.comparingDouble(Present::getWeight)).orElse(null);
       return present;

   }
   public Present getPresent(String name){
       Optional<Present> any = data.stream().filter(p -> p.getName().equals(name)).findAny();
       return any.orElse(null);
   }

   public String report(){
       StringBuilder str = new StringBuilder();

       String changed = this.color.substring(0,1).toUpperCase() + this.color.substring(1).toLowerCase();
       str.append(String.format("%s bag contains:%n",changed));
       if(data.size() > 0) {
           data.forEach(p -> str.append(p.toString()).append("\n"));
       }
       return str.toString().trim();
   }








}

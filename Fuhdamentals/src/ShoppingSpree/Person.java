package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct (Product product){
        if(this.money >= product.getCost()){
            this.products.add(product);
            this.money -= product.getCost();
        }else{
            throw new IllegalArgumentException(String.format("%s can't afford %s",this.name,product.getName()));
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("%s - ",this.name));
        if(products.isEmpty()){
           str.append("Nothing bought");
        }else{
            str.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }


        return str.toString();
    }
}

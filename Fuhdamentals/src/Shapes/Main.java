package Shapes;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(1.2,1.3);
        Shape shape1 = new Circle(1.2);

        printShape(shape);
        printShape(shape1);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
    }


}

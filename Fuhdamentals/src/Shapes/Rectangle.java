package Shapes;

public class Rectangle extends Shape{
    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    protected void calculatePerimeter() {
         super.setPerimeter(2*(this.height + this.width));
    }

    @Override
    protected void calculateArea() {
        super.setArea(this.height * this.width);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}

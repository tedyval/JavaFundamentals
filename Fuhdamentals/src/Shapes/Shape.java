package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;


    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public final Double getPerimeter() {
        if(perimeter == null){
            calculatePerimeter();
        }
        return perimeter;
    }

    public final  Double getArea() {
        if(area == null){
            calculateArea();
        }
        return area;
    }
}

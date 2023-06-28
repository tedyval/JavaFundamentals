package SquareRoot;

public class Number {
    private int number;

    public Number(int number) {
        this.setNumber(number);
    }

    public  double squareRoot(){
        return  Math.sqrt(this.number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number< 0){
            throw new IllegalArgumentException("Invalid number!");
        }
        this.number = number;
    }
}

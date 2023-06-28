package workingWithAbstraction;

public class Galaxy {
    private Field field;


    public Galaxy(Field field) {
        this.field = field;
    }

    public void moveEvil(int row, int col) {
        while (row >= 0 && col >= 0) {
            if (this.field.isInBounds(row, col)) {
                this.field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col) {
        long sum = 0;

        while (row >= 0 && col < this.field.getRowLength(1)) {
            if (this.field.isInBounds(row, col)) {
                sum += this.field.getValue(row, col);
            }

            col++;
            row--;
        }
        return sum;
    }

}

package workingWithAbstraction;

public class Field {
    private int[][] matrix;

    public Field(int row,int col) {
        this.matrix = new int[row][col];
        this.fillMatrix(0);
    }

    private void fillMatrix(int begin){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = begin++;
            }
        }
    }

    public  boolean isInBounds(int row, int col) {
        return row >= 0 && row < this.matrix.length && col >= 0 && col < this.matrix[row].length;
    }

    public int getValue(int row, int col){
        return this.matrix[row][col];
    }

    public void setValue(int row, int col ,int value) {
        this.matrix[row][col]= value;
    }

    public int getRowLength(int row){
        return this.matrix[row].length;
    }

}

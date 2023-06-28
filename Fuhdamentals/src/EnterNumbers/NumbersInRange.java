package EnterNumbers;

public class NumbersInRange {
    private int startNum;
    private int endNum;

    public NumbersInRange(int startNum, int endNum) {
        this.setStartNum(startNum,endNum);
        this.setEndNum(startNum,endNum);
    }


    public void print() {
        for (int i = startNum; i <= endNum ; i++) {
            System.out.println(i);

        }
    }

    public void setStartNum(int startNum,int endNum) {
        if (!isValidNum(startNum,endNum)) {
            throw new IllegalArgumentException("Invalid number!");
        }

        String num  = String.valueOf(startNum);
        for (int i = 0; i <num.length() ; i++) {
            if (!Character.isDigit(num.charAt(i))) {
                throw new NumberFormatException("The entered symbol is not digit!");
            }
        }


        this.startNum = startNum;
    }


    private boolean isValidNum(int startNum, int endNum) {
        return startNum > 1 && startNum < endNum && endNum <100;
    }




    public void setEndNum(int startNum,int endNum) {
        if (!isValidNum(startNum,endNum)) {
            throw new IllegalArgumentException("Invalid number!");
        }

        String num  = String.valueOf(endNum);
        for (int i = 0; i <num.length() ; i++) {
            if (!Character.isDigit(num.charAt(i))) {
                throw new NumberFormatException("The entered symbol is not digit!");
            }
        }

        this.endNum = endNum;
    }


}

package JavaAdvancedExam26Oct2019;

import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringg = scanner.nextLine();
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 'P') {
                    startRow = i;
                    startCol = j;
                }
            }
        }
        StringBuilder str = new StringBuilder(stringg);
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            matrix[startRow][startCol] = '-';

            switch (command) {
                case "up":
                    startRow--;
                    if (!isInMatrix(size, startRow, startCol)) {
                        startRow++;
                        if (str.length() > 0) {
                            str.deleteCharAt(str.length() - 1);
                        }
                        matrix[startRow][startCol] = 'P';
                    } else if (matrix[startRow][startCol] == '-') {
                        matrix[startRow][startCol] = 'P';
                    } else if (Character.isLetter(matrix[startRow][startCol])) {
                        if (matrix[startRow][startCol] != 'P') {
                            str.append(matrix[startRow][startCol]);
                            matrix[startRow][startCol] = 'P';
                        }
                    }

                    break;
                case "down":
                    startRow++;
                    if (!isInMatrix(size, startRow, startCol)) {
                        startRow--;
                        if (str.length() > 0) {
                            str.deleteCharAt(str.length() - 1);
                        }
                        matrix[startRow][startCol] = 'P';
                    } else if (matrix[startRow][startCol] == '-') {
                        matrix[startRow][startCol] = 'P';
                    } else if (Character.isLetter(matrix[startRow][startCol])) {
                        if (matrix[startRow][startCol] != 'P') {
                            str.append(matrix[startRow][startCol]);
                            matrix[startRow][startCol] = 'P';
                        }
                    }

                    break;
                case "left":
                    startCol--;
                    if (!isInMatrix(size, startRow, startCol)) {
                        startCol++;
                        if (str.length() > 0) {
                            str.deleteCharAt(str.length() - 1);
                        }
                        matrix[startRow][startCol] = 'P';
                    } else if (matrix[startRow][startCol] == '-') {
                        matrix[startRow][startCol] = 'P';
                    } else if (Character.isLetter(matrix[startRow][startCol])) {
                        if (matrix[startRow][startCol] != 'P') {
                            str.append(matrix[startRow][startCol]);
                            matrix[startRow][startCol] = 'P';
                        }
                    }

                    break;
                case "right":
                    startCol++;
                    if (!isInMatrix(size, startRow, startCol)) {
                        startCol--;
                        if (str.length() > 0) {
                            str.deleteCharAt(str.length() - 1);
                        }
                        matrix[startRow][startCol] = 'P';
                    } else if (matrix[startRow][startCol] == '-') {
                        matrix[startRow][startCol] = 'P';
                    } else if (Character.isLetter(matrix[startRow][startCol])) {
                        if (matrix[startRow][startCol] != 'P') {
                            str.append(matrix[startRow][startCol]);
                            matrix[startRow][startCol] = 'P';
                        }
                    }

                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(str.toString());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }

    private static boolean isInMatrix(int size, int r, int c) {
        return r >= 0 && r < size && c >= 0 && c < size;
    }
}

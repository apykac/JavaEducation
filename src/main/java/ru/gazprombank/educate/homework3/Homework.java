package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {

    }

    public static void printMatrix (int [][] matrix) {
        boolean endMatrix = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1)
                    System.out.print(matrix[i][j]);
                else System.out.print(matrix[i][j] + " ");
                if (i == matrix.length - 1)
                    endMatrix = true;
            }
            if (endMatrix == false)
                System.out.print('\n');
        }
    }
}

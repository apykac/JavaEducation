package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}};
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int l = 0; l< matrix[i].length; l++) {
                System.out.print(matrix[i][l] + " ");
            }
            System.out.println();
        }
    }
}
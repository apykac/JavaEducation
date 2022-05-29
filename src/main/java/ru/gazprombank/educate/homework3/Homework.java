package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 4, 4, 6}, {1, 3, 5, 6}, {8, 4, 9, 11}};
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}

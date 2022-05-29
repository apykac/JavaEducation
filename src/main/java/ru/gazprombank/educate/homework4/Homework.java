package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        randomMatrix(matrix);
    }

    public static int[][] randomMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
                if (matrix[i][j] == 0) {
                    matrix[i][j] = (i + j + 1);
                }
            }
        return matrix;
    }
}

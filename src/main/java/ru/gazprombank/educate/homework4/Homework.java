package ru.gazprombank.educate.homework4;
import java.util.Random;
public class Homework {
    public static void main(String[] args) {

    }
    public static int[][] randomMatrix(int[][]matrix){

        for (int i = 0; i < matrix.length; i++) {
            Random random = new Random();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2147483646);
            }
        }
        return matrix;
    }
}

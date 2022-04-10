package ru.gazprombank.educate.homework4;

public class Homework {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        randomMatrix(array);
        ru.gazprombank.educate.homework3.Homework.printMatrix(array);
    }

    public static int[][] randomMatrix(int[][] matrix){
        int a = 1;
        int b = 10;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = a + ((int)(Math.random()*b));
            }
        }
        return matrix;
    }

}

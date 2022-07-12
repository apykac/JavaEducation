package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 2}, {2, 1, 2, 2}, {3, 1, 3, 2}};
        printMatrix(array);
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

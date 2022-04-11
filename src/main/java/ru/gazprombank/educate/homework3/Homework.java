package ru.gazprombank.educate.homework3;

public class Homework {
    public static void printMatrix(int[][] twoSizeArray) {
        for (int i = 0; i < twoSizeArray.length; i++) {
            for (int j = 0; j < twoSizeArray.length; j++) {
                System.out.print(" " + twoSizeArray[i][j] + " ");
            }
          System.out.println();
        }

    }

    public static void main(String[] args) {

    }
}
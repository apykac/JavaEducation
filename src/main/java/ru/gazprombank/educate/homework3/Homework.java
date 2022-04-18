package ru.gazprombank.educate.homework3;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
    }

    public static int printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
                 }
        return 0;
    }
    }
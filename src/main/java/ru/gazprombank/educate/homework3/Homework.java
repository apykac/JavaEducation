package ru.gazprombank.educate.homework3;

import java.util.StringJoiner;

public class Homework {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        StringJoiner s2 = new StringJoiner("\n");
        for (int i = 0; i < matrix.length; i++) {
            StringJoiner s1 = new StringJoiner(" ");
            for (int j = 0; j < matrix[i].length; j++) {
               s1.add(String.valueOf(matrix[i][j]));
            }
            s2.add(s1.toString());
        }
        System.out.print(s2);
    }

}

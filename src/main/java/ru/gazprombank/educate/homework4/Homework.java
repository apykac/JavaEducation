package ru.gazprombank.educate.homework4;

public class Homework {

    public static int[][] randomMatrix(int[][] twoDimArray) {
        
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
               twoDimArray[i][j] = (int) (Math.random() * 100) + 1;
               System.out.print(twoDimArray[i][j] + " ");
            }
        }
        return twoDimArray;
    }

    public static void main(String[] args) {

    }
}
package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {

    }
    public static void printMatrix(int[][] twoDimArray){
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {

    }
    public static void printMatrix(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length - 1; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            if (i == twoDimArray.length-1){
                System.out.print(twoDimArray[i][twoDimArray[i].length-1]);
            }
            else{
                System.out.println(twoDimArray[i][twoDimArray[i].length-1]);
            }
        }
    }

}

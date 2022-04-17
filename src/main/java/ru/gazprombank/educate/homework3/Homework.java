package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}};
        printMatrix(numbers);
    }

/*    public static void printMatrix(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i != 0) System.out.print(" ");
                System.out.print(numbers[i][j]);
            }
            if (i != numbers.length - 1) System.out.println("\n");
        }
    }*/

    public static void printMatrix(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j == numbers[i].length - 1) System.out.print(numbers[i][j]);
                else System.out.print(numbers[i][j] + " ");
            }
            if (i != numbers.length - 1) System.out.println("\n");
        }
    }
}


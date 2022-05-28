package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        printMatrix(new int[][]{
                {1, 2, 4, 2, 1, 3},
                {2, 3, 4, 1, 3, 2,},
                {1, 3, 4, 5, 6, 1}
        });
    }

    public static void printMatrix(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length - 1; j++) {
                System.out.print(mass[i][j] + " ");
            }
            if (mass.length - 1 != i) {
                System.out.print(mass[i][mass[i].length - 1] + "\n");
            } else {
                System.out.print(mass[i][mass[i].length - 1]);
            }
        }
    }
}
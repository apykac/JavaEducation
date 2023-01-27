package ru.gazprombank.educate.homework3;

public class Homework {

    public static void printMatrix(int[][] app) {


        for (int row = 0; row < app.length; row++) {
            for (int ind = 0; ind < app[row].length; ind++) {
                int y = app[row].length - 1;
                if (ind != y) {
                    System.out.print(app[row][ind] + " ");
                } else
                    System.out.print(app[row][ind]);
            }
            int x = app.length - 1;
            if (row != x) {
                System.out.print("\n");
            }

        }
    }

    public static void main(String[] args) {

        int[][] app = {{5, 6, 7, 8, 9}, {5, 6, 7, 8, 9}};
        printMatrix(app);
    }
}

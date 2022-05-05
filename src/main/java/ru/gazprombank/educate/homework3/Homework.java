package ru.gazprombank.educate.homework3;

public class Homework {

    public static void printMatrix(int[][] ints) {
        String s = "";
        for (int i = 0; i < ints.length; i++) {
            if (i != 0 && i <= ints.length)
                s += "\n";
            for (int j = 0; j < ints[i].length; j++) {
                if (j == ints[i].length - 1)
                    s += ints[i][j];
                else
                    s += ints[i][j] + " ";
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Homework.printMatrix(new int[][]{{1, 2}, {4, 5}, {7, 8}, {4, 67}, {33, 111}});
    }
}

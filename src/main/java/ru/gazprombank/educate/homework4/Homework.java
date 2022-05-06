package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {

    public static int[][] randomMatrix(int[][] mass) {
        int rand = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                rand = (int) (Math.random() * 9) + 1;
                mass[i][j] = rand;
            }
        }
        return mass;
    }

    public static void main(String[] args) {

    }
}

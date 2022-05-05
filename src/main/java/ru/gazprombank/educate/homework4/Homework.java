package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {

    public static int[][] randomMatrix(int[][] mass) {
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt((9 - 1) + 1) + 1;
            }
        }
        return mass;
    }

    public static void main(String[] args) {

    }
}

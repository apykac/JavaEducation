package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }

    public static int[][] randomMatrix(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                Random random = new Random();
                do {
                    mass[i][j] = random.nextInt();
                } while (mass[i][j] == 0);
            }
        }
        return mass;
    }
}

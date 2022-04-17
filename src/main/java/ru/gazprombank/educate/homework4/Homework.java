package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }

    public static int[][] randomMatrix(int[][] randomNumbers){

        for (int i = 0; i < randomNumbers.length; i++) {
            Random random = new Random();
            for (int j = 0; j < randomNumbers[i].length; j++) {
                randomNumbers[i][j] = random.nextInt(10)+1;
            }
        }
        return randomNumbers;
    }
}

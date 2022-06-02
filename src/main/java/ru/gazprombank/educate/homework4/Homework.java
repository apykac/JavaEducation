package ru.gazprombank.educate.homework4;

import java.math.BigInteger;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }

    public static int getRandomInt(int min, int max){
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    public static int[][] randomMatrix(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                    inputMatrix[i][j] = getRandomInt(1, 1000000);
            }
        }

        return inputMatrix;
    }
}

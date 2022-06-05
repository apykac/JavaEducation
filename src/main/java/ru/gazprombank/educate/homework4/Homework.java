package ru.gazprombank.educate.homework4;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {
    public static void main(String[] args) {

    }
//
//    public static int getRandomInt(int min, int max){
//        Random random = new Random();
//        return random.ints(min, max)
//                .findFirst()
//                .getAsInt();
//    }

    public static int getRandomInt(int min, int max){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static int[][] randomMatrix(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (j % 2 == 0) {
              inputMatrix[i][j] = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE - 1);
                } else{
//              inputMatrix[i][j] = 1 + (int)(Math.random() * ((Integer.MAX_VALUE - 2) + 1));
                inputMatrix[i][j] = getRandomInt(1, Integer.MAX_VALUE - 1);
                }
            }
        }

        return inputMatrix;
    }
}

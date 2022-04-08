package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }
    public static void randomMatrix(double[][] a){
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextDouble();
            }
        }

    }
}

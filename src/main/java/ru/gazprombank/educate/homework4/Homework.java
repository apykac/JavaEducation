package ru.gazprombank.educate.homework4;

import java.awt.*;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }

    public static int [][] randomMatrix (int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            Random random = new Random();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1 + random.nextInt(10);
               // matrix[i][j] = (int) (1 + Math.random());
            }
        }
        return matrix;
    }
}

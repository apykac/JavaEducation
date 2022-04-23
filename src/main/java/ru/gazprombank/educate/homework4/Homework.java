package ru.gazprombank.educate.homework4;

import java.awt.*;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {

    }
    public static int [][] randomMatrix (int [][] matrix){
        Random rnd = new Random();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt();
                if (matrix[i][j] == 0)
                    matrix[i][j] = (i+j+1)*i;
            }
        return matrix;
    }
}

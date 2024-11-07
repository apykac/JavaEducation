package ru.gazprombank.educate.homework4;

import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        //int[][] array = new int[10][10];
        //randomMatrix(array);
    }


    public static int[][] randomMatrix(int[][] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt();
               // array[i][j] = random.nextInt(1, array[i].length);
                //array[i][j] = (int) (Math.random() * array[i].length);
            }
        }

            System.out.println(Arrays.deepToString(array));

        return array;
    }
}

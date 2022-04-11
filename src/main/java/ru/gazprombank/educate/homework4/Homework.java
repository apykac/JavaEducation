package ru.gazprombank.educate.homework4;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[][] matrix = new int[5][6];
        int[][] mass = randomMatrix(matrix);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length-1; j++) {
                System.out.print(mass[i][j]+" ") ;
            }
            if (i == mass.length-1){
                System.out.print(mass[i][mass[i].length-1]);
            } else{
                System.out.print(mass[i][mass[i].length-1]+"\n");
            }
        }
    }
    public static int[][] randomMatrix(int[][] a){
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt()*10+1;
            }
        }
        return a;

    }
}

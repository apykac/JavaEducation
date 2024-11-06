package ru.gazprombank.educate.homework3;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
       // int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       // printMatrix(a);
    }
    public static void printMatrix(int[][] array) {
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            System.out.print(array[i][j]);
            if(j == (array[i].length - 1)){
                break;}
            else{
                 System.out.print(" ");
                }
       }
        if(i == (array.length - 1)){
            break;
        }
        else {
            System.out.println();

}

    }
    }
}

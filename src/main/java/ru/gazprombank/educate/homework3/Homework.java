package ru.gazprombank.educate.homework3;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
       // int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //printMatrix(a);
    }
/*    public static void printMatrix(int[][] array) {
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
            System.out.println();*/

    /*}

        }
        }*/
/*    static String stringFinal = "";
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            String str  = Arrays.toString(array[i]);
            str = str.replaceAll("[\\[\\],]", "");
            if (i == array.length - 1) {
                stringFinal += str;
            } else {
                stringFinal = stringFinal + str + "\n";
            }
        }
             System.out.print(stringFinal);*/


    public static void printMatrix(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(Arrays.toString(array[i]));
                if (i == array.length - 1) {
                    break;
                } else {
                    stringBuilder.append("\n");
                }
        }
        String result = stringBuilder.toString();
        result = result.replaceAll("[\\[\\],]", "");
        System.out.print(result);
    }
}

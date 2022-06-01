package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] rra = {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}};
        printMatrix(rra);
    }

    public static void printMatrix(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            int e = arr.length-1;
            int h = arr[i].length-1;
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]);
                if(h>j){
                    System.out.print(" ");
                }
            }
            if (e>i)
            System.out.print("\n");
        }
    }
}

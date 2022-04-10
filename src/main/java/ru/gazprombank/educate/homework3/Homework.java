package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}};
        printMatrix(a);

    }
    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                System.out.print(a[i][j]+" ") ;
            }
            if (i == a.length-1){
                System.out.print(a[i][a[i].length-1]);
            } else{
                System.out.println(a[i][a[i].length-1]);
            }
        }
    }

}

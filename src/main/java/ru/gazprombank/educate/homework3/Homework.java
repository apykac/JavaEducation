package ru.gazprombank.educate.homework3;

public class Homework {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {4, 5}, {4, 67}, {33, 111}};
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
                System.out.print(a[i][a[i].length-1]+"\n");
            }
        }
    }
}

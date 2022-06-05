package ru.gazprombank.educate.homework12;

import java.util.ArrayList;

public class Homework {

    public static void main(String[] args) {
        System.out.println(sumUnique(3, 2, 3));

    }

    public static int sumUnique(int a, int b, int c){
        if (a == b && a == c && b == c){
            return 0;
        }

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }

        return arr[0]+arr[1]+arr[2];
    }
}

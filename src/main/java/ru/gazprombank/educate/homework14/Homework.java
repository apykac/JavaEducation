package ru.gazprombank.educate.homework14;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {

    }

    public static int partialSum(int a, int b, int c){

        int[] inner = new int[3];
        inner[0] = a;
        inner[1] = b;
        inner[2] = c;

        int sum = 0;

        for (int i = 0; i < inner.length; i++){
                if (inner[i] == 13) {
                    sum += 0;
                    break;
            }
                sum += inner[i];
        }

        return sum;

    }
}

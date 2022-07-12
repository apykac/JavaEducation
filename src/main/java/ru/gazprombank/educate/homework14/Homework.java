package ru.gazprombank.educate.homework14;

public class Homework {

    public static void main(String[] args) {

        int a = 13;
        int b = 8;
        int c = 2;
        System.out.println(partialSum(13, 8, 2));
    }

    public static int partialSum(int a, int b, int c) {

        int partialSum = a + b + c;
        if (a == 13)
        partialSum = 0;
        else{
            if (b == 13)
                partialSum = a;
            if (c == 13)
                partialSum = a + b;
        }
        return partialSum;
    }
}
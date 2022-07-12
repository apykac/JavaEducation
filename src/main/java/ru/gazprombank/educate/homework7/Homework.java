package ru.gazprombank.educate.homework7;


public class Homework {

    public static void main(String[] args) {
        System.out.println(twoSumOne(8, 3, 5));
    }

    public static boolean twoSumOne(int a, int b, int c) {

        boolean sum = false;
        if ((a + b == c) || (b + c == a) || (a + c == b))
            sum = true;
        return sum;
    }
}
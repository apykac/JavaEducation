package ru.gazprombank.educate.homework7;

public class Homework {

    public static void main(String[] args) {
        System.out.println(twoSumOne(3, 1, 2));
    }

    public static boolean twoSumOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

}

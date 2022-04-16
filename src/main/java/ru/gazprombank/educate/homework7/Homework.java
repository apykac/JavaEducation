package ru.gazprombank.educate.homework7;

public class Homework {
    public static boolean twoSumOne(int a, int b, int c) {

        if ((a + b == c) || (a + c == b) || (b + c == a)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
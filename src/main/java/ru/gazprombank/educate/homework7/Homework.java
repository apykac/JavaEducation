package ru.gazprombank.educate.homework7;

public class Homework {

    public static void main(String[] args) {
        twoSumOne(2, 4, 7);
        System.out.println(twoSumOne(2, 4, 7));
    }

    public static boolean twoSumOne(int a, int b, int c) {
        return  a + b == c || a + c == b || b + c == a;

        }
    }


package ru.gazprombank.educate.homework7;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean twoSumOne (int a, int b, int c) {
        boolean sum = false;
        // Одинарные операторы сравнения заменить двойными
        if ((a + b == c) | (b + c == a) | (a + c == b))
            sum = true;
        return sum;
    }
}

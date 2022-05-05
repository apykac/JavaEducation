package ru.gazprombank.educate.homework14;

public class Homework {

    public static int partialSum(int a, int b, int c) {
        if (a == 13)
            return 0;
        if (b == 13)
            return a;
        if (c == 13)
            return a + b;

        return a + b + c;
    }

    public static void main(String[] args) {

    }
}

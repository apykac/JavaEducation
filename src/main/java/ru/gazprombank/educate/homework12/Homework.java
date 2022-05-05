package ru.gazprombank.educate.homework12;

public class Homework {

    public static int sumUnique(int a, int b, int c) {
        if (a == b && b == c && a == c)
            return 0;
        if (a != b && b != c && a != c)
            return a + b + c;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (a == c)
            return b;

        return 0;
    }

    public static void main(String[] args) {

    }
}

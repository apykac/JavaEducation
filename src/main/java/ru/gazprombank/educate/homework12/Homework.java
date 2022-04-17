package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {

    }

    public static int sumUnique(int a, int b, int c) {
        int result;
        if ((a == b) && (a == c)) result = 0;
        else if (a == c) result = b;
        else if (c == b) result = a;
        else if (a == b) result = c;
        else result = a + b + c;
        return result;
    }
}

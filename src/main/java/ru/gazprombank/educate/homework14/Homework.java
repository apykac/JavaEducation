package ru.gazprombank.educate.homework14;

public class Homework {

    public static void main(String[] args) {

    }

    public static int partialSum(int a, int b, int c) {
        int result;
        if (a == 13) result = 0;
        else if (b == 13) result = a;
        else if (c == 13) result = a + b;
        else result = a + b + c;
        return result;
    }

}

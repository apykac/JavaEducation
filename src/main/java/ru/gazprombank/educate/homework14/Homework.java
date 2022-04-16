package ru.gazprombank.educate.homework14;

public class Homework {
    public static int partialSum(int a, int b, int c) {
        int sum;
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            sum = a + b;
            return sum;
        } else {
            sum = a + b + c;
            return sum;
        }
    }

    public static void main(String[] args) {

    }
}

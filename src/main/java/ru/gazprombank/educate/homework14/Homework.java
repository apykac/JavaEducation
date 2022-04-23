package ru.gazprombank.educate.homework14;

public class Homework {

    public static void main(String[] args) {

    }

    public static int partialSum (int a, int b, int c) {
        int sum = 0;
        if ((a != 13) & (b != 13) & (c !=13))
            sum = a + b + c;
        else {
            if (a == 13)
                sum = 0;
            if ((a != 13) & (b == 13))
                sum = a;
            if ((a != 13) & (b != 13))
                sum = a + b;
        }
        return sum;
    }
}

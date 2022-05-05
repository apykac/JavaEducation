package ru.gazprombank.educate.homework13;

public class Homework {

    public static int nearestTwentyOne(int a, int b) {
        if (a > 21 && b > 21)
            return 0;
        if (a > 21)
            return b;
        if (b > 21)
            return a;
        if ((21 - a) > (21 - b))
            return b;
        if ((21 - a) < (21 - b))
            return a;

        return 0;
    }

    public static void main(String[] args) {

    }
}

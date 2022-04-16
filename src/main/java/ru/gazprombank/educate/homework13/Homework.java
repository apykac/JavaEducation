package ru.gazprombank.educate.homework13;

public class Homework {
    public static int nearestTwentyOne(int a, int b) {
        int num = 0;
        if ((a > 21) && (b > 21)) {
            return 0;
        } else if ((21 - a < 21 - b) && (a <= 21 && b <= 21)) {
            return a;
        } else if ((21 - a > 21 - b) && (a <= 21 && b <= 21)){
            return b;
        } else if ((21 - a < 21 - b) && (a > 21)) {
            return b;
        } else if ((21 - a > 21 - b) && (b > 21)) {
            return a;
        }

        return num;
    }

    public static void main(String[] args) {

    }
}

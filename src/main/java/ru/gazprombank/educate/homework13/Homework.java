package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {

    }

    public static int nearestTwentyOne (int a, int b) {
        int near = 0;
        boolean trA = false;
        boolean trB = false;
        if ((a > 21) && (b > 21))
            // Это бессмысленно, переменная и так равна 0
            near = 0;
        else {
            if (a > 21) {
                near = b;
                trA = true;
            }
            if (b > 21) {
                near = a;
                trB = true;
            }
            int a1 = 21 - a;
            int b1 = 21 - b;
            if (a1 < b1) {
                if ((!trA) && (!trB)) {
                    near = a;
                }
            }
            else if ((!trA) && (!trB)) {
                near = b;
            }
        }
        return near;
    }
}

package ru.gazprombank.educate.homework13;

public class Homework {
    public static void main(String[] args) {
        int a = 25;
        int b= 2;
        System.out.println(nearestTwentyOne(25, 2));
    }
    public static int nearestTwentyOne(int a, int b) {

        int nearestTwentyOne = 0;
        if ((a <= 21 && b <= 21 && a >= b) || (a <= 21 && b > 21)) {
            nearestTwentyOne = a;
        } else if ((a <= 21 && b <= 21 && a <= b) || (a > 21 && b <= 21)) {
            nearestTwentyOne = b;
        }
        return nearestTwentyOne;
    }
}

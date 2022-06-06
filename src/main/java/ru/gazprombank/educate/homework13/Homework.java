package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {

    }

    public static int nearestTwentyOne(int a, int b){

        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21){
            return a;
        }

        int i = 21 - a;
        int j = 21 - b;

        if (i < j) {
            return a;
        } else {
            return b;
        }

    }
}

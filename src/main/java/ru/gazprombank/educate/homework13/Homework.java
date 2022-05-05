package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {
        System.out.println(nearestTwentyOne(20, 19));
    }

    public static int nearestTwentyOne(int a, int b) {
        if (21 - a >= 0 && 21 - b >= 0){
            return Math.max(a,b);
        }
        if (21 - a < 0){
            return b;
                    }
        if (21 - b < 0){
            return a;
        }
        return 0;
            }

}
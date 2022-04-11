package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {

    }
    public static int nearestTwentyOne(int a, int b){
        if (a<= 21 && b<=21 && a>=b || a<=21 && b>21){
            return a;
        }
        else if (a<= 21 && b<=21 && a<=b || a>21 && b<=21){
            return b;
        }
        else {
            return 0;
        }
    }
}

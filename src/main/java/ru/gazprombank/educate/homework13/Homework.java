package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {

        //nearestTwentyOne(19, 21);
    }
    public static int nearestTwentyOne(int a, int b){

        int resultA = 0;
        int resultB = 0;

        if(a <= 21){
            resultA = a;
        }
        if(b <= 21){
            resultB = b;
        }

        return Math.max(resultA, resultB);
    }
}

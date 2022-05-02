package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {
        System.out.println(nearestTwentyOne(21,25));
    }
    public static int nearestTwentyOne(int a, int b){
        int nearest=0;

        if ((a<= 21 && b<=21 && a>=b) || (a<=21 && b>21)){
            nearest = a;
        }
        else if ((a<= 21 && b<=21 && a<=b) || (a>21 && b<=21)){
            nearest = b;
        }
        return nearest;
    }
}

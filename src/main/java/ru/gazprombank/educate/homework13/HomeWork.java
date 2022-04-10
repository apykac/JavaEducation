package ru.gazprombank.educate.homework13;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(nearestTwentyOne(32, 22));

    }
    public static int nearestTwentyOne(int a, int b){
        int result = 0;
        if (a <= 21 && b <= 21) {
            if ( 21 - a < 21- b ) {
                result = a;
            } else {
                result = b;
            }
        } else if (a <= 21 && b > 21) {
            result = a ;
        } else if (a > 21 && b <= 21) {
            result = b;
        }
        return result;
    }
}

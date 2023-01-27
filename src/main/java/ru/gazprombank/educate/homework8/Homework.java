package ru.gazprombank.educate.homework8;

public class Homework {
    public static boolean birdsSinging(int temp, boolean isSummer) {

        return ( (isSummer==true && temp >=60 && temp <=100) ? (true) : ((isSummer==false && temp>=60 && temp <=90) ? (true):(false) ) );
    }

    ;

    public static void main(String[] args) {

    }
}

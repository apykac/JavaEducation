package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {

        int temp = 60;
        boolean isSummer = true;
        System.out.println(birdsSinging(60, true));
    }

    public static boolean birdsSinging(int temp, boolean isSummer) {
        boolean birdsSinging = true;
        if ((temp > 60 && temp <= 100) && (isSummer)) birdsSinging = true ;
        else if ((temp > 101) && (isSummer)) birdsSinging = false ;
        else if ((temp > 91) && !(isSummer)) birdsSinging = false ;
        return birdsSinging;
    }
}
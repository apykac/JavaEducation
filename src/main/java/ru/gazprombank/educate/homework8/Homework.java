package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean birdsSinging(int temp, boolean isSummer){
        int upperLimit = 90;
        int lowerLimit = 60;

        if (isSummer){
            upperLimit = 100;
        }

        return lowerLimit <= temp && temp <= upperLimit;
    }
}

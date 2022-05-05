package ru.gazprombank.educate.homework8;

public class Homework {

    public static boolean birdsSinging(int temp, boolean isSummer) {
        int min= 60;
        int max = isSummer ? 100 : 90;

        if (temp >= min && temp <= max)
            return true;

        return false;
    }

    public static void main(String[] args) {

    }
}

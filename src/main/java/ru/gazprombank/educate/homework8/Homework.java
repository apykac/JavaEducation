package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {
        birdsSinging(95, false);
    }

    public static boolean birdsSinging(int temp, boolean isSummer){
        return (temp > 59 && temp < 91 && !isSummer) || (temp > 61 && temp < 101 && isSummer);

    }
}

package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {
        // birdsSinging(50, isSummer);
        System.out.println(birdsSinging(50, false));
    }

    public static boolean birdsSinging(int temp, boolean isSummer) {
        if ((temp >= 60) && ((temp <= 90 && !isSummer) || (temp <= 100 && isSummer))) {
            return true;
        }
        return false;
    }

}

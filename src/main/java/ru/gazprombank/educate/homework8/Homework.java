package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {
    birdsSinging(99, true);
    }

    public static boolean birdsSinging(int temp, boolean isSummer) {
        if (!isSummer) {
            if (temp >= 60 && temp <= 90) {
                return true;
            }
        } else {
            if (temp >= 60 && temp <= 100) {
                return true;
            }

        }
        return isSummer;
    }
}

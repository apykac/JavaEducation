package ru.gazprombank.educate.homework8;

public class Homework {

    public static boolean birdsSinging(int temp, boolean isSummer) {
        if (isSummer == true) {
            if (temp <= 100) {
                return true;
            }
        } else {
            if (temp <= 90 && temp >= 60) {
                return true;
            } else if (temp < 60) {
                return false;
            }
        }
        return isSummer;
    }

    public static void main(String[] args) {

    }
}
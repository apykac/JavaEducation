package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean birdsSinging (int temp, boolean isSummer) {
        boolean song = false;
        if (!isSummer) {
            if ((temp >= 60) & (temp <= 90)) {
                song = true;
            }
        } else {
            if ((temp >= 60) & (temp <= 100)) {
                song = true;
            }
        }
            return song;
    }

}

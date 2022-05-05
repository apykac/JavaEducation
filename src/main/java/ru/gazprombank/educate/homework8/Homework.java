package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean birdsSinging (int temp, boolean isSummer) {
        boolean song = false;
        // Булеву переменную сравнивают другим способом
        // Форматирование кода плавает
        if (isSummer == false) {
            if ((temp >= 60) & (temp <= 90))
                song = true;
        } else {
            if ((temp >= 60) & (temp <= 100))
                song = true;
        }
            return song;
        }

}

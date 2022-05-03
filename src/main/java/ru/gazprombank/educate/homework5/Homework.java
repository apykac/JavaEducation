package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        String text = "HELLO";
        System.out.println(middleThree(text));
    }

    public static String middleThree(String text) {

        int x = text.length() / 2;
        if (text.length() <= 3) {
            return text;
        } else {
            return text.substring(x - 1, x + 2);
        }
    }
}

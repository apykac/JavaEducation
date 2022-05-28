package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        System.out.println(middleThree("Jamaica"));
    }

    public static String middleThree(String string) {
        if (string.length() < 3) {
            return string;
        } else {
            return string.substring(string.length() / 2 - 1, string.length() / 2 + 2);
        }
    }
}

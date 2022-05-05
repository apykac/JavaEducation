package ru.gazprombank.educate.homework5;

public class Homework {

    public static String middleThree(String str) {
        String result = "";
        if (str.length() >= 5) {
            int center = str.length() / 2 + 1;
            result += str.substring(center - 2, center + 1);
        } else {
            return str;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

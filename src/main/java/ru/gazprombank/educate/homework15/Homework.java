package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }

    public static String repeatChar (String str) {
        String strDouble = "";
        for (int i = 0; i < str.length(); i++)
            strDouble = strDouble + str.charAt(i) + str.charAt(i);
        return strDouble;
    }
}

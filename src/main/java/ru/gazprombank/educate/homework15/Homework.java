package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }

    public static String repeatChar (String str) {
        String strDouble = "";
        for (int i = 0; i < str.length(); i++)
            strDouble = new StringBuilder().append(strDouble).append(str.charAt(i)).append(str.charAt(i)).toString();
        return strDouble;
    }
}

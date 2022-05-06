package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }

    public static String repeatChar (String str) {
        StringBuilder strDouble = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strDouble = strDouble.append(str.charAt(i)).append(str.charAt(i));
        }
        return strDouble.toString();
    }
}

package ru.gazprombank.educate.homework22;

public class Homework {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(hyphenSplit(String str));
    }

    public static String hyphenSplit(String str) {
        String newStr = str.substring(1);
        if (newStr.length() < 1)
            return "";

        if (str.charAt(0) == str.charAt(1)) {
            return str.substring(0, 1) + "-" + hyphenSplit(newStr.substring(0));
        } else {
            return str.substring(0, 1) + hyphenSplit(newStr.substring(0));
        }
    }
}
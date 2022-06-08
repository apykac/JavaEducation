package ru.gazprombank.educate.homework22;

import java.util.Objects;

public class Homework {

    public static void main(String[] args) {

    }

    public static String hyphenSplit(String str) {
        if (Objects.equals (str, ""))
            return str;
        String newString = str.substring(1);
        if (newString.length() < 1)
            return str;
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "-" + hyphenSplit(newString);
        } else {
            return str.charAt(0) + hyphenSplit(newString);
        }
    }
}

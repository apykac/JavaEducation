package ru.gazprombank.educate.homework22;

import java.util.Objects;

public class Homework {

    public static void main(String[] args) {
        System.out.println(hyphenSplit("xxyy"));
    }

    public static String hyphenSplit(String str) {

        if (Objects.equals(str, "")) return "";

        String newStr = str.substring(1);
        if (newStr.length() < 1)
            return str;

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "-" + hyphenSplit(newStr);
        } else {
            return str.charAt(0) + hyphenSplit(newStr);
        }
    }
}

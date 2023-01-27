package ru.gazprombank.educate.homework23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {

    public static String insideBrackets(String str) {

        if (str.contains("[") && str.contains("]")) {
            int a = str.indexOf("[");
            int b = str.indexOf("]");

            return str.substring(a, b+1);
        } else return str;

    }

    public static void main(String[] args) {

    }
}

package ru.gazprombank.educate.homework23;

import java.util.Objects;

public class Homework {

    public static StringBuilder strN = new StringBuilder();
    public static StringBuilder strE = new StringBuilder();
    public static boolean isOK = false;

    public static void main(String[] args) {

    }

    public static String insideBrackets (String str) {

        if (str.charAt(0) == ']') {
            isOK = false;
            strN = strN.append(str.charAt(0));
            strE = strN;
            strN = new StringBuilder();
            return strE.toString();
        }

        if ((str.charAt(0) == '[') || (isOK)) {
            isOK = true;
            strN = strN.append(str.charAt(0));
        }

        strE = new StringBuilder(str.substring(1));
        return insideBrackets(strE.toString());
    }
}

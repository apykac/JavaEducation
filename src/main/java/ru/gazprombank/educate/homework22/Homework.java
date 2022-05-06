package ru.gazprombank.educate.homework22;

import java.util.Objects;

public class Homework {

    public static StringBuilder strN = new StringBuilder();
    public static StringBuilder strE = new StringBuilder();
    public static boolean rep = false;

    public static void main(String[] args) {

    }

    public static String hyphenSplit (String str) {

        if (str.length() <= 1) {
            if (!rep) {
                strN = strN.append(str);
            }
            rep = false;
            strE = strN;
            strN = new StringBuilder();
            return strE.toString();
        }

        if (str.charAt(0) == str.charAt(1)) {
            if (!rep) {
                strN = strN.append(str.charAt(0)).append("-").append(str.charAt(1));
            } else {
                strN = strN.append("-").append(str.charAt(1));
            }
            rep = true;
        } else {
            if (!rep) {
                strN = strN.append(str.charAt(0));
            }
            rep = false;
        }

        strE = new StringBuilder(str.substring(1));
        return hyphenSplit(strE.toString());
    }
}

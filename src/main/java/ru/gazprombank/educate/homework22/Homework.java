package ru.gazprombank.educate.homework22;

import java.util.Objects;

public class Homework {

    public static String strN = "";
    public static String strE = "";
    public static boolean rep = false;

    public static void main(String[] args) {

    }

    public static String hyphenSplit (String str) {

        if (str.length() <= 1) {
            if (!rep) {
                strN = new StringBuilder().append(strN).append(str).toString();
            }
            rep = false;
            strE = strN;
            strN = "";
            return strE;
        }

        if (str.charAt(0) == str.charAt(1)) {
            if (!rep) {
                strN = new StringBuilder().append(strN).append(str.charAt(0)).append("-").append(str.charAt(1)).toString();
            } else {
                strN = new StringBuilder().append(strN).append("-").append(str.charAt(1)).toString();
            }
            rep = true;
        } else {
            if (!rep) {
                strN = new StringBuilder().append(strN).append(str.charAt(0)).toString();
            }
            rep = false;
        }

        strE = str.substring(1);
        return hyphenSplit(strE);
    }
}

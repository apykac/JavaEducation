package ru.gazprombank.educate.homework23;

import java.util.Objects;

public class Homework {

    public static String strN = "";
    public static String strE = "";
    public static boolean isOK = false;

    public static void main(String[] args) {

    }

    public static String insideBrackets (String str) {

        if (Objects.equals(str.charAt(0),']')) {
            isOK = false;
            strN = new StringBuilder().append(strN).append(str.charAt(0)).toString();
            strE = strN;
            strN = "";
            return strE;
        }

        if ((Objects.equals(str.charAt(0),'[')) || (isOK)) {
            isOK = true;
            strN = new StringBuilder().append(strN).append(str.charAt(0)).toString();
        }

        strE = str.substring(1);
        return insideBrackets(strE);
    }
}

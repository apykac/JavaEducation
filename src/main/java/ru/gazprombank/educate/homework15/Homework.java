package ru.gazprombank.educate.homework15;

import java.util.ArrayList;

public class Homework {

    public static String repeatChar(String str) {
        char[] strObs = str.toCharArray();
        String strExp = "";
        for (char ch : strObs) {
            strExp += String.valueOf(ch);
            strExp += String.valueOf(ch);
        }
        return strExp;
    }

    public static void main(String[] args) {

    }
}

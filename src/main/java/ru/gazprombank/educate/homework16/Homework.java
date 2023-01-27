package ru.gazprombank.educate.homework16;

import java.util.ArrayList;

public class Homework {

    public static String starKill(String str) {


        str = str.replaceAll(".?\\*+.?", "");
        return str;

    }


    public static void main(String[] args) {
        starKill("**zal***up*a");
    }
}

package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {
        System.out.println(starKill("ab**cd"));
    }

    public static String starKill(String str) {
        while (str.contains("*")) {
            str = str.replaceAll(".{1}\\*{1,}.{1}", "");
        }
        return str;


    }

}



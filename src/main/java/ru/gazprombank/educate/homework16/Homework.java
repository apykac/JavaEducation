package ru.gazprombank.educate.homework16;

public class Homework {

    public static String starKill(String str) {
        str = str.replaceAll("^\\*.", "");
        str = str.replaceAll(".\\*$", "");
        str = str.replaceAll("\\*{3}", "*");
        str = str.replaceAll("\\*{2}", "*");
        str = str.replaceAll(".\\*.", "");
        str = str.replaceAll("\\*", "");
        return str;
    }

    public static void main(String[] args) {

    }
}

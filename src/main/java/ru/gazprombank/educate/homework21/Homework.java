package ru.gazprombank.educate.homework21;

public class Homework {

    public static String endoo(String str) {
        if (str.contains("o")) {
            str = str.substring(0, str.indexOf("o")) + str.substring(str.indexOf("o") + 1);
            return endoo(str) + "o";
        } else return str;
    }

    public static void main(String[] args) {
    }
}

package ru.gazprombank.educate.homework20;


public class Homework {

    public static int yoYo(String str) {

        if (!str.contains("yo")) {
            return 0;
        }
        return 1 + yoYo(str.substring(str.indexOf("yo") + 2));
    }


    public static void main(String[] args) {


    }
}

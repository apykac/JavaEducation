package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {

    }

    public static String starKill(String str){
        return str.replaceAll("(.{0,1}\\*+.{0,1})", "");
    }
}

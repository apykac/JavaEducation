package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }

    public static String repeatChar(String str){

        char[] inStr = str.toCharArray();

        String finStr = "";

        for (char c : inStr) {
            for (int j = 0; j < 2; j++) {
                finStr += c;
            }
        }

        return finStr;
    }
}

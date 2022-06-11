package ru.gazprombank.educate.homework22;

public class Homework {

    public static void main(String[] args) {

    }

    public static String hyphenSplit(String str){
        String hyp = "-";

        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)){
            return hyphenSplit(str.charAt(0) + hyp + str.substring(1));
        } else {
            return str.charAt(0) + hyphenSplit(str.substring(1));
        }


    }
}

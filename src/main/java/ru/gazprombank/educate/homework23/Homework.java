package ru.gazprombank.educate.homework23;

public class Homework {

    public static void main(String[] args) {

    }

    public static String insideBrackets(String str){
        int index1 = 0;
        int index2 = 0;

        index1 = str.indexOf('[');
        index2 = str.lastIndexOf(']');
        str = str.substring(index1, index2 + 1);

        return str;
    }
}

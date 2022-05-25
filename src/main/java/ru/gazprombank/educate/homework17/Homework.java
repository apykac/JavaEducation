package ru.gazprombank.educate.homework17;

public class Homework {

    public static void main(String[] args) {

    }

    public static int wordsCount(String[] words, int len) {
        int i = 0;
        for (String a : words) {
            if (a.length() == len) i++;
        }
        return i;
    }
}
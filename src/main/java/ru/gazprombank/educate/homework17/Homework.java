package ru.gazprombank.educate.homework17;

public class Homework {
    public static int wordsCount(String[] words, int len) {
        int num = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                num = num + 1;
            }
        }

        return num;

    }

    public static void main(String[] args) {

    }
}
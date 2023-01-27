package ru.gazprombank.educate.homework17;

public class Homework {

    public static int wordsCount(String[] words, int len) {

        int g = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() == len) {
                g = g + 1;
            }
        }

        return g;
    }

    public static void main(String[] args) {

    }
}

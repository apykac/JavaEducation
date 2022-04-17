package ru.gazprombank.educate.homework17;

public class Homework {

    public static void main(String[] args) {

    }

    public static int wordsCount(String[] words, int len) {
        int result = 0;
        for (String word : words) {
            if (word.length() == len) result++;
        }
        return result;
    }
}

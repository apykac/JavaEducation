package ru.gazprombank.educate.homework17;

public class Homework {

    public static int wordsCount(String[] words, int len) {
        int i = 0;
        for (String s : words) {
            if (s.length() == len)
                i++;
        }
        return i;
    }

    public static void main(String[] args) {

    }
}

package ru.gazprombank.educate.homework17;

public class Homework {

    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 5));
    }

    public static int wordsCount(String[] words, int len) {
        int countString = 0;
        for (String value : words) {
            if (len == value.length()) countString++;
        }
        return countString;
    }
}

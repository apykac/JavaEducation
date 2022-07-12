package ru.gazprombank.educate.homework17;

public class Homework {

    public static void main(String[] args) {
        String[][] words = {{"aaa"}, {"qaz"}};
        int len = 2;
        System.out.println(wordsCount(new String[]{"aaa", "qaz"}, 2));
    }
    public static int wordsCount(String[] words, int len) {
        int stroki = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                stroki++;
            }
        }
        return stroki;
   }
}

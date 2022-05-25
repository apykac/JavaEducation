package ru.gazprombank.educate.homework17;

public class Homework {
    public static void main(String[] args) {
    String[] words = new String[]{"a", "bb", "b", "ccc"};
    int len = 3;
        System.out.println(wordsCount(words, len));
}
    public static int wordsCount(String[] words, int len) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (len == words[i].length()){
                counter ++;
            }

        }
        return counter;
    }

}

package ru.gazprombank.educate.homework17;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "ccc"}, 3));
    }
    public static int wordsCount(String[] words, int len){
        int count = 0;
        for (int i = 0; i<words.length; i++){
            if (words[i].length() == len){
                count ++;
            }
        }
        return count;
    }
}

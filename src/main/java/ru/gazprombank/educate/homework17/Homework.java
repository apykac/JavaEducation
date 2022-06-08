package ru.gazprombank.educate.homework17;

public class Homework {

    public static void main(String[] args) {

    }

    public static int wordsCount(String[] words, int len){
        int count = 0;

        for(String s : words){
            if (s.length() == len){
                count++;
            }
        }

        return count;
    }
}

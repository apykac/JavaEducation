package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        String text = "Вася, Петя, Коля - лучшие друзья!";
        System.out.println(punctuationCount(text));
    }

    public static int punctuationCount(String text){
        int textLength = text.length();
        String punctuations = ",.-?!\"#$%&'()*+/:;<=>\\]^`{|}~@[_";
        int pCount = 0;
        for (int i = 0; i < textLength; i++){
            if (punctuations.contains(String.valueOf(text.charAt(i)))){
                pCount ++;
            }
        }
        return pCount;
    }
}

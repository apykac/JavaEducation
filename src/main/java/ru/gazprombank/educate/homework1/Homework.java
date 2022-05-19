package ru.gazprombank.educate.homework1;


import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        String punctuation = "В=опрос. о смысле, жизни также может, пониматься как субъективная!!! оценка!!стая целью жизни?";
        int count = 0;
        for(int i = 0; i < punctuation.length(); i++) {
            count++;
        }
        System.out.println("Колличество в тексте знаков  пунктуации " + count);
    }
}

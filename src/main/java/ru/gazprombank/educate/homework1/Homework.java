package ru.gazprombank.educate.homework1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {
        String text = "fgjhdf./dfjh,!hjg?";
        System.out.println(punctuationCount(text));

    }
    public static int punctuationCount(String text){
        char[] punctuation = ".,!?;:-".toCharArray();
        char[] s = text.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++){
            for (int j = 0; j < punctuation.length; j++){
                if (s[i] == punctuation[j]){
                    count++;
                }
            }

        }
        return count;
    }
}

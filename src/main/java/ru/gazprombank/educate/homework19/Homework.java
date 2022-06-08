package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {

    }

    public static int longestStreak(String str){
        int len = 0;
        char prev;
        int longest = 0;

        if (str.length() != 0) {
            prev = str.toCharArray()[0];
            len = 0;
            for (char c : str.toCharArray()) {
                if (c == prev){
                    len++;
                } else {
                    if (len >= longest){
                        longest = len;
                    }
                    prev = c;
                    len = 1;
                }
            }
            if (len >= longest){
                longest = len;
            }
        }

        return longest;
    }
}

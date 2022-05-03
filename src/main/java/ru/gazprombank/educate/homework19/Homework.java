package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {
        System.out.println(longestStreak("HELLO"));
    }

    public static int longestStreak(String str) {
         int next = 1;
        if (str == "") {
            next = 0;
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1))
                    next++;
            }
        }
        return next;
    }
}

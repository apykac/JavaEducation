package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {
        System.out.println(longestStreak("XPNzzzddOOOxx"));
    }

    public static int longestStreak(String str) {
        int ctr = 1;
        int output = 0;
        int j;
        for (int i = 0; i < str.length() - 1; i++) {
            j = i;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                ctr++;
            }
            if (ctr > output) {
                output = j;
            }
            ctr = 1;
        }
        return output;
    }
}

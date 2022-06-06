package ru.gazprombank.educate.homework19;

import java.util.Objects;

public class Homework {

    public static void main(String[] args) {
        System.out.println(longestStreak("XPNzzzddOOOxx"));
    }

    public static int longestStreak(String str) {
        int i1 = 1;
        int i2 = 1;
        if (Objects.equals(str, "")) return 0;
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    i1++;
                } else if (i1 > i2) {
                    i2 = i1;
                    i1 = 1;
                } else i1 = 1;
            }
            if (i1 > i2) {
                i2 = i1;
            }
            return i2;
        }
    }
}

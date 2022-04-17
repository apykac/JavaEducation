package ru.gazprombank.educate.homework19;

import java.util.Objects;

public class Homework {

    public static void main(String[] args) {

    }



    public static int longestStreak(String str) {
        int result = 1;
        int result2 = 1;
        if (Objects.equals(str, "")) return 0;
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    result++;
                } else if (result > result2) {
                    result2 = result;
                    result = 1;
                } else result = 1;
            }
            if (result > result2) {
                result2 = result;
            }
            return result2;
        }

    }

}

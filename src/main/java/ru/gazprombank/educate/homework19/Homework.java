package ru.gazprombank.educate.homework19;

public class Homework {

    public static int longestStreak(String str) {
        int result = 1;
        int buffer = 1;
        if (str.equals("")) return 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                buffer++;
            else if (buffer > result) {
                result = buffer;
                buffer = 1;
            }else buffer = 1;
        }
        if (buffer > result)
            result = buffer;

        return result;
    }

    public static void main(String[] args) {

    }
}

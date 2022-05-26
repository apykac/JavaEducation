package ru.gazprombank.educate.homework19;

public class Homework {

    public static int longestStreak(String str) {
        char[] charArray = str.toCharArray();
        int temp = 0;
        int max = 0;
        for (int i = 0; i < charArray.length; ) {
            temp = charArray[i];
            int count = 1;
            while (++i < charArray.length && charArray[i] == temp)
                ++count;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
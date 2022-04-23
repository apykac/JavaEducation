package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {

    }

    public static int longestStreak (String str) {
        int count = 1;
        int countF = 1;
        if (str == "") return 0;
         else {
            for (int i = 0; i < str.length() - 1; i ++) {
                if (str.charAt(i) == str.charAt(i + 1))
                    countF ++;
                else
                    if (count < countF) {
                        count = countF;
                        countF = 1;
                    } else countF = 1;
            }
        }
        if (count < countF) count = countF;
        return count;
    }
}

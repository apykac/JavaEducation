package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        String str1 = "What, where,when?";
        System.out.println(punctuationCount(str1));
    }


    public static int punctuationCount(String str1) {
        char[] punctuationArray = {',', '?'};
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (char c : punctuationArray) {
                if (str1.charAt(i) == c) {
                    count++;
                    break;
                }
            }

        }
        return count;
    }
}



package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {

    }
    public static int longestStreak(String str){
        int count = 1;
        int[] value = new int[str.length()];
        int max = 0 ;
        if (str != "") {
            for (int i = 0; i<str.length() - 1; i++) {
                for (int j = i + 1; j<str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                    else {
                        break;
                    }
                }
                value[i] = count;
                count = 1;
            }
            for (int i = 0; i<value.length; i++) {
                if (value[i] > max) {
                    max = value[i];
                }
            }
        }
        return max;
    }
}

package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {

    }
    public static int longestStreak(String str){
        int count = 1;
        int[] values = new int[str.length()];
        int max = 0 ;
        if (str != "") {
            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                values[i] = count;
                count = 1;
            }
            for (int i = 0; i < values.length; i++) {
                if (values[i] > max) {
                    max = values[i];
                }
            }
        }
        return max;
    }
}

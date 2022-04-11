package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {
        System.out.println(longestStreak("xxXXXX"));

    }
    public static int longestStreak(String str){
        int count = 1;
        int[] result = new int[str.length()];
        int maxCount = 0 ;
        if (str != "") {
            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                result[i] = count;
                count = 1;
            }
            for (int i = 0; i < result.length; i++) {
                if (result[i] > maxCount) {
                    maxCount = result[i];
                }
            }
        }
        return maxCount;
    }
}

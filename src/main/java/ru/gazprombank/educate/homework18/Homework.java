package ru.gazprombank.educate.homework18;

public class Homework {

    public static void main(String[] args) {
        System.out.println(matchingChar(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }

    public static int matchingChar(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0) {
                if (b[i].length() != 0) {
                    if (a[i].charAt(0) == b[i].charAt(0)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

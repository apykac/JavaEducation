package ru.gazprombank.educate.homework18;

public class Homework {

    public static int matchingChar(String[] a, String[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("") || b[i].equals(""))
                continue;
            if (a[i].charAt(0) == b[i].charAt(0))
                result++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

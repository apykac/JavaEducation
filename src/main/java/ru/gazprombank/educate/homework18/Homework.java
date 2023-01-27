package ru.gazprombank.educate.homework18;

public class Homework {

    public static int matchingChar(String[] a, String[] b) {


        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    z = z + 1;
                }
            }
        }


        return z;
    }

    public static void main(String[] args) {

    }
}

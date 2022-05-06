package ru.gazprombank.educate.homework18;


public class Homework {

    private final static String EMPTY_STRING = "";

    public static void main(String[] args) {

    }

    public static int matchingChar (String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i ++) {
              if ((!EMPTY_STRING.equals(a[i])) && (!EMPTY_STRING.equals(b[i]))) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}

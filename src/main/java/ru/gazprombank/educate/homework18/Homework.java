package ru.gazprombank.educate.homework18;

public class Homework {

    public static void main(String[] args) {
        String[] a = new String[]{"aa", "", " cc"};
        String[] b = new String[]{"aa", "dd", "jj"};
        System.out.println(matchingChar(a, b));
    }

    private static int matchingChar(String[] a, String[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a [i].equals("") && b[i].startsWith(String.valueOf(a[i].charAt(0)))) {
                counter++;
            }
        }
        return counter;
    }
}

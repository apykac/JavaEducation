package ru.gazprombank.educate.homework25;

public class Homework {
    public static void main(String[] args) {
        System.out.println(getPrefix(new String[]{"test2", "test2", "test2Tr", "te"}));
    }

    public static String getPrefix(String[] array) {

        int prefixMaxLen = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (prefixMaxLen > array[i].length()) {
                prefixMaxLen = array[i].length();
            }
        }

        String prefix = "";
        char temp;
        for (int i = 0; i < prefixMaxLen; i++) {
            temp = array[0].charAt(i);
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].charAt(i) == array[j+1].charAt(i)) {

                } else {
                    return prefix;
                }
            }
            prefix = prefix + temp;
        }
        return prefix;
    }
}
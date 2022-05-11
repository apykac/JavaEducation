package ru.gazprombank.educate.homework25;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        String[] str = {"test2", "test2", "test2Tr", "te"};
        System.out.println(getPrefix(str));
    }

    public static String getPrefix(String[] strings) {
        int size = strings.length;

        if (size == 0)
            return "";

        if (size == 1)
            return strings[0];

        Arrays.sort(strings);
        int min = Math.min(strings[0].length(), strings[size - 1].length());
        int i = 0;
        while (i < min && strings[0].charAt(i) == strings[size - 1].charAt(i))
            i++;
        String prefix = strings[0].substring(0, i);
        return prefix;

    }
}

package ru.gazprombank.educate.homework25;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        String[] str = {"hey, hey1, hey man, heyyaaa"};
        System.out.println(getPrefix(str));
    }

    public static String getPrefix(String[] strings) {
       if (strings.length == 0)
           return "";
        if (strings.length == 1)
            return strings[0];

        Arrays.sort(strings);
        int min = Math.min(strings[0].length(), strings[0].length());
        int i = 0;
        while (i < min && strings[0].charAt(i) == strings[1].charAt(i))
            i++;
        String prefix = strings[0].substring(0, i);
        return prefix;

    }
}
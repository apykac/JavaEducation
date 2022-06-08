package ru.gazprombank.educate.homework25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

    }

    public static String getPrefix(String[] strings) {
        int str1 = strings.length;
        if (str1 == 0)
            return " ";
            if (str1 == 1)
                return strings[0];
            Arrays.sort(strings);
            int min = Math.min(strings[0].length(), strings[str1 - 1].length());
            int i = 0;
            while (i < min && strings[0].charAt(i) == strings[str1 - 1].charAt(i))
                i++;
            String prefix = strings[0].substring(0,i);
            return prefix;
    }
}

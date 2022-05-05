package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static Map<String, String> getMapFromString(String str) {
        Map<String, String> map = new HashMap<>();
        char[] array= str.toCharArray();
        int i = 0;
        for (char a : array) {
            for (char b : array) {
                if (a == b)
                    i++;
            }
            map.put(String.valueOf(a), String.valueOf(i));
            i = 0;
        }
        return map;
    }

    public static void main(String[] args) {

    }
}

package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Homework {

    public static void main(String[] args) {

    }

    public static Map <Integer, Integer> getMapFromString (String str) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals(String.valueOf(i))) {
                    count++;
                }
            }
            if (count > 0) {
                map.put(i, count);
            }
        }
        return map;
    }
}

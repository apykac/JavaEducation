package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {

    }
    public static Map<Integer, Integer>getMapFromString(String str) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int result = 0;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals(String.valueOf(i))) {
                    result++;
                }
            }
            if (result > 0) {
                map.put(i, result);
            }
        }
        return map;
    }
}

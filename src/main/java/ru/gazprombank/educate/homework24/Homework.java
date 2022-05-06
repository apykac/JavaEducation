package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static Map<Integer, Integer> getMapFromString(String str) {
        String buffer = "";
        for (int i = 0; i < str.length(); i++) {
            if (isNumber(str.substring(i, i+1)))
                buffer += str.substring(i, i+1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        char[] chars = buffer.toCharArray();
        for (char ch1 : chars) {
            for (char ch2 : chars) {
                if (ch1 == ch2)
                    count++;
            }
            map.put(Integer.parseInt(String.valueOf(ch1)), count);
            count = 0;
        }
        return map;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

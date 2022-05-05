package ru.gazprombank.educate.homework24;

import java.util.HashMap;

public class Homework {

    public static void main(String[] args) {

    }

    public static HashMap getMapFromString (String str) {
        HashMap <Integer, Integer> Map = new HashMap<>();
        int count = 0;
        for (int i = 0; i <= 9; i++)
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i)
                    count++;
                Map.put(i,count);
            }
        return Map;
    }
}

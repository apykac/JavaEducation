package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {

    }

    public static Map<Integer, Integer> getMapFromString(String str){
        Map<Integer, Integer> innerMap = new HashMap<>();

        for (char c : str.toCharArray()){

            if (!innerMap.containsKey(Character.getNumericValue(c))){
                if (Character.isDigit(c)) {
                    innerMap.put(Character.getNumericValue(c), 1);
                }
            } else {
                innerMap.merge(Character.getNumericValue(c), 1, Integer::sum);
            }
        }

        return innerMap;

    }

}

package ru.gazprombank.educate.homework24;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {

        getMapFromString("1231241");
    }

    public static Map getMapFromString(String str){

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int key = Character.getNumericValue(str.charAt(i));
                if(!map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                }
            }

        }



        return map;
    }
}

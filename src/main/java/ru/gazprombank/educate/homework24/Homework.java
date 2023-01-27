package ru.gazprombank.educate.homework24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static Map getMapFromString(String str) {


        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList hehe = new ArrayList<Integer>();

        if (str == "") {
            return map;
        }
        int counter = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (!hehe.contains(i) && Character.isDigit(str.charAt(i))) {

                for (int j = i + 1; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j)) && !hehe.contains(j) && str.charAt(i) == str.charAt(j)) {

                        counter = counter + 1;
                        hehe.add(j);

                    }
                }
                map.put(Integer.valueOf(Character.getNumericValue(str.charAt(i))), Integer.valueOf(counter));

            }

            counter = 1;
        }

        return map;

    }


    public static void main(String[] args) {

        getMapFromString("1231241");

    }
}

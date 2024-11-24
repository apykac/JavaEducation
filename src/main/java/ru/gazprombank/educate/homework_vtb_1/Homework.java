package ru.gazprombank.educate.homework_vtb_1;

import java.util.*;

public class Homework {

    private static final Map<Character, Integer> costOfCharacters = new LinkedHashMap<>();

    private static Map<Integer, List<String>> costOfStringWithListOfStrings;

    static {
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            costOfCharacters.put(i, ++count);
        }
    }

    public static void main(String[] args) {
        String[] strings1 = {"aaaa", "bbbb", "aaccaab", "abab", "z", "z", "aabaab"};
        String[] strings2 = {"aaaa", "aaaa", "aaaaa", "aaaaa"};
        String[] strings3 = {};
        String[] strings4 = {"1", "2"};
        String[] strings5 = {"1 + 1", "stroka1", "zz", ""};
        String[] strings6 = null;
        String[] strings7 = {null};

        getMaxSumOfCharactersInString(strings1);
        getMaxSumOfCharactersInString(strings2);
        getMaxSumOfCharactersInString(strings3);
        getMaxSumOfCharactersInString(strings4);
        getMaxSumOfCharactersInString(strings5);
        getMaxSumOfCharactersInString(strings6);
        getMaxSumOfCharactersInString(strings7);
    }

    public static void getMaxSumOfCharactersInString(String[] strings) {
        List<String> tempList = new ArrayList<>();
        int maxSumOfCharactersInString = 0;
        int tempCostOfString;
        costOfStringWithListOfStrings = new LinkedHashMap<>();

        for (String c : strings) {
            tempCostOfString = getTotalCostOfString(c);

            if (tempCostOfString > 0) {
                tempList = costOfStringWithListOfStrings.getOrDefault(tempCostOfString, new ArrayList<>());
                tempList.add(c);
                costOfStringWithListOfStrings.put(tempCostOfString, tempList);
                if (tempCostOfString > maxSumOfCharactersInString) {
                    maxSumOfCharactersInString = tempCostOfString;
                }
            }
        }

        List<String> resultList = costOfStringWithListOfStrings.getOrDefault(maxSumOfCharactersInString, new ArrayList<>());

        if (!resultList.isEmpty()) {
            int shortStringOfList = resultList.get(0).length();

            for (String c : resultList) {
                if (c.length() < shortStringOfList) {
                    shortStringOfList = c.length();
                }
            }

            for (String s : resultList) {
                if (s.length() == shortStringOfList) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println("Массив строк пуст или не содержит допустимых символов");
        }
    }

    public static int getTotalCostOfString(String str) { // ""
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count += costOfCharacters.getOrDefault(str.charAt(i), 0);
        }

        return count;
    }
}

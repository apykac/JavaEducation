package ru.gazprombank.educate.homework25;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {

        String[] str = new String[]{"00000000", "000", "111111111111111", "11111111111111111111111122222222"};

//        System.out.println(getPrefix(str));
        getPrefix(str);

    }

    public static String getPrefix(String[] strings){
        int mapKey = 0;

        Map<Integer, String> storage= new HashMap<>();

        //1. Сравниваем все строки между собой и наполняем мапу префиксами DONE

        for (int i = 0; i < strings.length; i++){
            for (int j =1; j < strings.length; j++){
                if ((!storage.containsValue(comparator(strings[i], strings[j])) && comparator(strings[i], strings[j]).length() > 0)) {
                    storage.putIfAbsent(mapKey, comparator(strings[i], strings[j]));
                    mapKey++;
                }
            }
        }

        for (int j = 0; j < storage.size(); j++){
            System.out.println(storage.get(j));
        }

        //2. Проходимся по мапе и смотрим есть ли среди имеющихся префиксов тот, который подходит всем строкам
        //   Если есть, то возвращаем его
        for (Map.Entry<Integer, String> entry : storage.entrySet()){
            if (prefixCheck(entry.getValue(), strings)){
                return entry.getValue();
            }
        }

        //   Если нет, то вычисляем самый длинный из имеющихся и возвращаем его
        if (storage.size() > 0) {
            return longestPrefix(storage);
        } else {
            return "";
        }
    }

    public static String comparator(String str1, String str2){
        String first = str1;
        String second = str2;
        String prefix = "";

        if (!first.equals(second)) {

            while (first.length() > 0 && second.length() > 0) {
                if (first.charAt(0) == second.charAt(0)) {
                    prefix = prefix + first.charAt(0);
                    first = first.substring(1);
                    second = second.substring(1);
                } else {
                    break;
                }
            }
        }

        return prefix;
    }

    public static boolean prefixCheck(String str, String[] strings){
        boolean fitsAll = true;

        for (String s : strings){
            if (!s.startsWith(str)){
                fitsAll = false;
                break;
            }
        }

        return fitsAll;
    }

    public static String longestPrefix(Map<Integer, String> inputMap){
        String longest = "";

        for (Map.Entry<Integer, String> entry : inputMap.entrySet()){
            if (entry.getValue().length() > longest.length()){
                longest = entry.getValue();
            }
        }

        return longest;
    }

}


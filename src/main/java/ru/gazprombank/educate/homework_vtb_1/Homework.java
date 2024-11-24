package ru.gazprombank.educate.homework_vtb_1;

import java.util.*;

public class Homework {

    private static final Map<Character, Integer> costOfCharacters = new LinkedHashMap<>();
    private static void listOfCharacters(){
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            costOfCharacters.put(i, ++count);
        }
    }

    private static int maxSum = 0;
    private static Map<Integer, List<String>> listStringOfCost = new LinkedHashMap<>();



    public static void main(String[] args) {
        String[] strings = {"aaaa", "bbbb", "aaccaab", "abab", "z", "z" , "aabaab"};

        listOfCharacters();
        maxSumCharInString(strings);


    }



    public static void maxSumCharInString(String[] strings){

        List<String> list = new ArrayList<>();
        int tempValue = 0;
        for(String c : strings){
            tempValue = costString(c);
            list = listStringOfCost.getOrDefault(tempValue, new ArrayList<>());
            list.add(c);
            listStringOfCost.put(tempValue, list);
            if(tempValue > maxSum) {
                    maxSum = tempValue;
                }
        }
        result();
    }


    public static int costString(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            count += costOfCharacters.get(str.charAt(i));

        }
        return count;
    }

    public static void result() {
        List <String> resultList = listStringOfCost.get(maxSum);
        int shortStringOfList = resultList.get(0).length();

        for(String c : resultList){
            if(c.length() < shortStringOfList){
                shortStringOfList = c.length();
            }
        }
        for(String s : resultList){
            if(s.length() == shortStringOfList){
                System.out.println(s);
            }
        }

    }
}

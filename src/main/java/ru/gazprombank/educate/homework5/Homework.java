package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {

    }

   public static String middleThree(String str){
        String result = "";
        int i = (str.length()-3)/2;
        if (str.length()<4) result = str;
        else result = str.substring(i, str.length()-i);
        return result;
    }
}

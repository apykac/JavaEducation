package ru.gazprombank.educate.homework5;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static String middleThree(String str){
        String result = "";
        int i = str.length()/2;
        if (str.length()<4) result = str;
        else result = str.substring(i-1) + str.substring(i) + str.substring(i+1);
        return result;
    }
}

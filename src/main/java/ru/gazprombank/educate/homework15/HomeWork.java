package ru.gazprombank.educate.homework15;

public class HomeWork {

    public static void main(String[] args) {

    }


    public static String repeatChar(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            newStr = newStr + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }
}
